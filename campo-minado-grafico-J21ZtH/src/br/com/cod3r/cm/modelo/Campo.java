package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean aberto;
	private boolean minado;
	private boolean marcado;
	
	private List<Campo> vizinhos = new ArrayList<>();
	private List<CampoObservador> observadores = new ArrayList<>();
	//pode-se usar isso ou a interface funcional criada
	
	private List<BiConsumer<Campo, CampoEvento>> observadores2 = new ArrayList<>();
	//outra opção
	
	
	Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public void registrarObservador(CampoObservador obs) {
		observadores.add(obs);//seria interessante um set ao inves de uma List
	}
	
	private void notificarObservadores(CampoEvento evento) {
		observadores.stream().forEach(o -> o.eventoOcorreu(this, evento));
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(this.linha - vizinho.linha);
		int deltaColuna = Math.abs(this.coluna - vizinho.coluna);
		
		int deltaGeral = deltaLinha + deltaColuna;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		}
		
		else if(deltaGeral == 2 && diagonal){
			vizinhos.add(vizinho);
			return true;
		}
		
		return false;
	}
	
	void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
		
		if(marcado) {
			notificarObservadores(CampoEvento.MARCAR);
		}
		else {
			notificarObservadores(CampoEvento.DESMARCAR);
		}
	}
	
	boolean abrir() {
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
			}
			
			setAberto(true);
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			return true;
			
		}
		return false;
	}
	
	boolean vizinhancaSegura() {
		
		return vizinhos.stream().noneMatch(v -> v.minado);//EH
	}
	
	public boolean isMarcado() {
		return this.marcado;
	}
	
	boolean minar() {
		if(!minado) {
			this.minado = true;
			return true;			
		}
		return false;
	}
	
	public boolean isAberto() {
		return this.aberto;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
		
		if(aberto) {
			notificarObservadores(CampoEvento.ABRIR);
		}
	}

	public boolean isFechado() {
		return !this.aberto;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		
		return desvendado || protegido;
	}
	
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {//fazer teste
		aberto = false;
		minado = false;
		marcado = false;
	}

	public boolean isMinado() {
		return minado;
	}
	
}

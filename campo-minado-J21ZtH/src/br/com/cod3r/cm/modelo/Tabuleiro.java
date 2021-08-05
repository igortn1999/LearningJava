package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<>();
	
	public Tabuleiro(int linhas, int colunas, int minas){
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas=minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
		
	}
	
	public void abrir(int linha, int coluna) {
		
		try {
			campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst().ifPresent(c -> c.abrir());
			
		}catch(ExplosaoException explodiu) {
			campos.forEach(c -> c.setAberto(true));
			throw explodiu;
		}
		
	}
	
	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst().ifPresent(c -> c.alternarMarcacao());
		
	}


	private void gerarCampos() {
		
		for(int l = 0; l < linhas; l++) {
			for(int c =0; c< colunas; c++){
				campos.add(new Campo(l, c));
			}
		}
		
	}
	
	private void associarVizinhos() {
		for(Campo c1 : campos) {
			for(Campo c2 : campos) {
				c1.adicionarVizinho(c2);
			}
		}
		
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		Campo c1;

		do {
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas=campos.stream().filter(c -> c.isMinado()).count();
		}while(minasArmadas < minas);
		
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());
	}
	
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}
	
	public String toString() {
		String retorno = "";
		
		for(Campo campo : campos) {
			if(campo.getColuna()==0) {
				retorno+="\n";
			}
			retorno += campo + " ";
		}
		
		
		return retorno;
	}
	
	public String toStringGabarito() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("    ");
		for(int c= 0; c<linhas;c++) {
			
			sb.append(" ");
			sb.append(c);
			sb.append(" ");
		}
		
		sb.append("\n\n");
		
		int i =0;
		for(int l = 0; l<linhas;l++) {
			sb.append(l);
			sb.append("   ");
			for(int c = 0;c<colunas;c++) {
				
				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
}

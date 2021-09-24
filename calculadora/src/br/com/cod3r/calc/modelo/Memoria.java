package br.com.cod3r.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando{
		ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA
	};
	
	private static final Memoria instancia = new Memoria();
	
	private final List<MemoriaObservador> observadores =
											new ArrayList<>();
	
	private String textoAtual = "";

	//a criação de momória só pode ser feita dentro da própria classe
	private Memoria() { 
		
	}
	//limitar Memoria para que só possa haver uma instancia
	//o unico jeito de pegar uma instancia da memória é através do getter,
	//já que o contrutor é privado
	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObservador(MemoriaObservador o) {
		observadores.add(o);
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty()? "0" : textoAtual;
	}
	
	public void processarComando(String valor){
		
		
		
		if("AC".equals(valor)) {
			textoAtual="";
		}
		else {			
			textoAtual+=valor;
		}
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}

}

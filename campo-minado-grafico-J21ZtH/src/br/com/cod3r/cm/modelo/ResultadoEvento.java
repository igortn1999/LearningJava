package br.com.cod3r.cm.modelo;

public class ResultadoEvento {

	private final boolean ganhou;
	
	public ResultadoEvento(Boolean ganhou) {
		this.ganhou = ganhou;
	}
	
	public boolean isGanhou() {
		return this.ganhou;
	}
	
	
}

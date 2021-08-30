package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Temp {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(3, 3, 9);
		
		tabuleiro.registrarObservador(e -> {
			
			if(e.isGanhou()) {
				System.out.println("ganhou");
			}
			else {
				System.out.println("Perdeu");
			}
			
		});
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {				
				tabuleiro.alternarMarcacao(i, j);
			}
		}
		
		
		
	}

}

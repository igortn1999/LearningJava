package br.com.cod3r.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.SairException;
import br.com.cod3r.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
	
	private Tabuleiro tabuleiro;
	private Scanner sc = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tab){
		this.tabuleiro = tab;
		
		executarJogo();
	}
	
	void executarJogo() {
		
		try {
			boolean continuar = true;
			while(continuar) {
				cicloJogo();
				
				System.out.println("Outra partida? [S/n]");
				String resposta = sc.nextLine();
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				}
				else {
					tabuleiro.reiniciar();
				}
					
				
			}
			
		}catch(SairException sair) {
			System.out.println("Tchau!!!");
		}finally {
			sc.close();
		}
		
	}

	private void cicloJogo() {
		
		try {
			while(!tabuleiro.objetivoAlcancado()) {
			System.out.println(tabuleiro.toStringGabarito());
			
			String digitado = capturar("Digite (x, y): ");
			
			Iterator<Integer> xy = Arrays.stream(digitado.split(","))
				.map(e -> Integer.parseInt(e.trim())).iterator();
			
			digitado = capturar("1- Abrir\n2- (Des)Marcar\n");
			
			if("1".equals(digitado)) {
				tabuleiro.abrir(xy.next(), xy.next());
			}
			if("2".equals(digitado)) {
				tabuleiro.alternarMarcacao(xy.next(), xy.next());
			}
			
			
			
			
			
			}
			System.out.println(tabuleiro);
			System.out.println("Você ganhou!");
			
		}catch(ExplosaoException explodiu) {
			System.out.println(tabuleiro);
			System.out.println("Você perdeu!");
		}
		
	}
	
	private String capturar(String txt) {
		System.out.print(txt);
		String digitado = sc.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		
		return digitado;
	}
}

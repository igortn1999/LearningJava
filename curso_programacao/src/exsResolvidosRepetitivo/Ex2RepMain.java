package exsResolvidosRepetitivo;

import java.util.Scanner;

public class Ex2RepMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double media = 0.0;
		
		int idade,soma,qtd;
		idade=soma=qtd=0;
		
		
		
		while(idade>=0) {
			
			System.out.println("Digite uma idade");
			idade = sc.nextInt();
			
			if(idade>=0) {
				soma += idade;
				qtd++;
			}
		}
		
		if(qtd<1) {
			System.out.println("Impossivel calcular");
			sc.close();
		}
		
		else { 
			media = (double) soma/qtd;
			System.out.printf("Media: %.2f\n", media);
			sc.close();
		}
	}

}

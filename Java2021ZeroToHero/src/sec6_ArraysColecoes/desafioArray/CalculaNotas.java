package sec6_ArraysColecoes.desafioArray;

import java.util.Scanner;

public class CalculaNotas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qtd de notas: ");
		double[] notas = new double[sc.nextInt()];
		
		for(int i=0;i<notas.length;i++) {
			System.out.println("Digite a nota: " + (i+1) + "/" + notas.length); 
			notas[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(double nota : notas) {
			soma+=nota;
		}
		
		double media = soma/notas.length;
		
		System.out.printf("Media: %.2f\n", media);
		
		sc.close();
		
	}
}

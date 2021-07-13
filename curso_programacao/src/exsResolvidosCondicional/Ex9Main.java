package exsResolvidosCondicional;

import java.util.Scanner;

public class Ex9Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para o dia da semana");
		int dia = sc.nextInt();
		
		switch (dia) {
		
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda-feira");
			break;
			
		case 3:
			System.out.println("Terça-feira");
			break;
			
		case 4:
			System.out.println("Quarta-feira");
			break;
			
		case 5:
			System.out.println("Quinta-feira");
			break;
			
		case 6:
			System.out.println("Sexta-cheira");
			break;
			
		case 7:
			System.out.println("Sabado");
			break;
		
		default:
			System.out.println("Valor inválido!");
			break;
		}
		sc.close();
	}

}

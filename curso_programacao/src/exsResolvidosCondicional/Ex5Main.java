package exsResolvidosCondicional;

import java.util.Scanner;

public class Ex5Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n1, n2, fim;
		
		n1=n2=fim=0.0;
		
		System.out.println("N1 = ?");
		n1 = sc.nextDouble();
		
		System.out.println("N2 = ?");
		n2 = sc.nextDouble();
		
		fim = n1+n2;
		
		if(fim >= 60.00) {
			System.out.printf("\nNota: %.2f\nStatus: Aprovado!\n", fim);
		}
		else {
			System.out.printf("\nNota: %.2f\nStatus: ¡Reprobaste!\n", fim);
		}
		
		sc.close();
		
	}

}

package exsResolvidosCondicional;

import java.util.Scanner;

public class Ex8Main {

	public static void main(String[] args) {
		int valor = 50;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Minutos = ?");
		int min = sc.nextInt();
		
		if(min > 100) {
			valor += ((min-100)*2);
		}
		
		System.out.println("Valor a ser pago: R$" + valor + ".00");
		
		
		sc.close();
	}
}

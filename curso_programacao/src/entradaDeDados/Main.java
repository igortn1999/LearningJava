package entradaDeDados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//para receber dados, é preciso criar um objeto do tipo Scanner
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();//comando de entrada de dados tipo String
		System.out.println("Voce digitou: "+ x);
		
		int a;
		a = sc.nextInt();//comando de entrada de dados tipo int
		System.out.println("Voce digitou o numero: "+ a);
		
		char b;
		b = sc.next().charAt(0);//comando de entrada de dados tipo char
		System.out.println("Voce digitou o char: "+ b);
		
		//para ler até a quebra de linha
		String string;
		sc.nextLine();//recebe o enter da linha anterior
		string= sc.nextLine();
		System.out.println("Voce digitou: "+ string);
		
		sc.close();
	}

}

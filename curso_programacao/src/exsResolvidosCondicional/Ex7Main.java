package exsResolvidosCondicional;

import java.util.Scanner;

public class Ex7Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, menor;
		
		System.out.println("N1 = ?");
		n1=sc.nextInt();
		
		menor=n1;
		
		System.out.println("N2 = ?");
		n2=sc.nextInt();
		
		if(n2<menor) {
			menor = n2;
		}
		
		System.out.println("N3 = ?");
		n3=sc.nextInt();
		
		if(n3<menor) {
			menor = n3;
		}
		
		System.out.println("menor numero: " + menor);
		sc.close();
	}

}

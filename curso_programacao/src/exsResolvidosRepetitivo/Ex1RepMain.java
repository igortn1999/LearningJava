package exsResolvidosRepetitivo;

import java.util.Scanner;

public class Ex1RepMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("N1 = ?");
			int n1 = sc.nextInt();
			
			System.out.println("N2 = ?");
			int n2 = sc.nextInt();
			
			if(n1 < n2){
				System.out.println("Ordem Crescente");
			}
			else if(n2 < n1){
				System.out.println("Ordem Decrescente");
			}
			else {
				System.out.println("São iguais");
			}
			
			System.out.println("\n------------------------------\n");
		}
		
		
	}

}

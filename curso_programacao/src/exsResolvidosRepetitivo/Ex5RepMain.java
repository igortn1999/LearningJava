package exsResolvidosRepetitivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5RepMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String resp;
		
		do {
			
			System.out.println("digite a temperatura em ˚C: ");
			
			double c = (double) sc.nextDouble();
			
			double f = (double) (((9*c)/5)+32);
			
			System.out.println(c+"˚C = "+ f+"˚F");
			
			System.out.println("Deseja inserir outro valor? (s/n)");
			resp=sc.next();
			
		}while(resp.equals("s"));
		
		System.out.println("Fechou");
		sc.close();
		
//		ArrayList lista = new ArrayList<String>();
//		
//		lista.add("banana");
//		lista.add("maçã");
//		lista.add("canela");
//		
//		System.out.println(lista);
	}
}

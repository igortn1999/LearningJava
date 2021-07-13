package exsResolvidosCondicional;

import java.util.Scanner;

public class Ex3Main {

	public static void main(String[] args) {
		
		String nome1, nome2;
		
		int idade1, idade2;
		
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da 1 pessoa: ");
		nome1 = sc.next();
		
		System.out.println("Digite a idade da 1 pessoa: ");
		idade1 = sc.nextInt();
		
		System.out.println("Digite o nome da 2 pessoa: ");
		nome2 = sc.next();
		
		System.out.println("Digite a idade da 2 pessoa: ");
		idade2 = sc.nextInt();
				
		media = (double) (idade1 + idade2)/2;
		
		System.out.printf("\nA idade media entre %s e %s é %.1f\n", nome1, nome2, media);
		
		sc.close();
	}

}

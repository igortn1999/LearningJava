package exsResolvidosCondicional;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		
		double l = 0.0, c= 0.0;
		
		double vf = 0.00;
		
		double area = 0.00, preco = 0.00;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("L = ?");
		l = sc.nextDouble();
		
		System.out.println("C = ?");
		c = sc.nextDouble();
		
		System.out.println("preco do m2 = ?");
		preco = sc.nextDouble();
		
		area = l*c;
		
		vf = area * preco;
		
		System.out.printf("\nArea:\t %.2f \nPreco:\t %.2f\n", area, vf);
		sc.close();
		

	}

}

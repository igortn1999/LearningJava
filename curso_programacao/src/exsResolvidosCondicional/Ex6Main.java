package exsResolvidosCondicional;

import java.util.Scanner;

public class Ex6Main {
	
	private static double delta(double a, double b, double c) {
		double d=0.0;
		
		d = (double) (Math.pow(b, 2.0)-(4.0*a*c));
		
		
		return (double) d;
		
	}

	public static void main(String[] args) {
		
		boolean loop = true;
		double a, b, c, d, x1, x2;
		a=b=c=d=x1=x2=0.0;
		
		
		Scanner sc = new Scanner(System.in);
		
		while(loop) {
			
			System.out.println("A = ?");
			a = sc.nextDouble();
		
			if(a!=0.0) loop=false;
			else System.out.println("Não vai me quebrar não. A≠0");
		}
		
		loop = true;
		
		while(loop) {
		
			System.out.println("B = ?");
			b = sc.nextDouble();
			
			System.out.println("C = ?");
			c = sc.nextDouble();
			
			d= delta(a,b,c);
			
			if(d >= 0) {
				loop=false;
			}
			
			else {
				 System.out.println("Não vai me quebrar não. ∆ > 0");
			}
		}
		
		x1= (double) (b*(-1) + (Math.sqrt(d)))/(2*a);
		
		x2 = (double) (b*(-1) - (Math.sqrt(d)))/(2*a);		
		
		System.out.printf("X1 = %.5f\n", x1);
		System.out.printf("X2 = %.5f\n", x2);
		
		sc.close();
	}
}

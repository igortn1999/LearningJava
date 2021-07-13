package exsResolvidosCondicional;

import java.util.Scanner;

public class Ex2Main {

	public static void main(String[] args) {
		
		double l, h, area, per, diag;
		l=h=area=per=diag=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("L = ?");
		l = sc.nextDouble();
		
		System.out.println("H = ?");
		h = sc.nextDouble();
		
		area = l*h;
		
		per = 2*(l+h);
		
		double l2= Math.pow(l, 2);
		double h2= Math.pow(h, 2);
		
		diag = Math.sqrt(l2+h2);
		
		System.out.printf("\nAREA:\t%.4f\nPERIMETRO:\t%.4f\nDIAGONAL:\t%.4f\n", area, per, diag);
		sc.close();
		
		
		
	}

}

package exsResolvidosRepetitivo;

import java.util.Scanner;

public class Ex3RepMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, N = 0;
		boolean loop = true;
		
		while(loop) {
			N = sc.nextInt();
			if(2 < N && N < 1000) {
				loop = false;
			}
		}
		
		for(i=1; i<=10; i++) {
			System.out.println(i + " x " + N +" = "+(i*N));
		}
		
		
	}

}

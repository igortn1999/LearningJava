package exsResolvidosCondicional;

import java.util.Scanner;

public class Ex4Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total, h, min, s;
		
		System.out.println("tempo em s:");
		total=sc.nextInt();
		
		h = total/3600;
		
		min = (total%3600)/60;
		
		s = (total%3600)%60;
		
		System.out.println(total+"s = "+ h +":"+ min + ":"+ s);
		
		sc.close();
		
	}

}

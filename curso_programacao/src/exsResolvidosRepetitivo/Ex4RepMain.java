package exsResolvidosRepetitivo;

import java.util.Scanner;

public class Ex4RepMain {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1, n2,maior,menor,i, soma;
		n1=n2=soma=0;
		
		System.out.println("n1 = ?");
		n1 = sc.nextInt();
		
		menor = n1;
		
		System.out.println("n2 = ?");
		n2 = sc.nextInt();
		
		if(n2<n1) {
			
			menor = n2;
			maior = n1;
		}
		else {
			maior = n2;
		}
		
		System.out.println("Numeros impares entre "+menor+" e "+maior+": ");
		
		for(i=menor+1; i<maior; i++) {
			
			if(i%2!=0) {
				soma+= i;
				System.out.println(i);
			}

		}
		
		System.out.println("soma: "+soma);
		sc.close();
	}
	
}

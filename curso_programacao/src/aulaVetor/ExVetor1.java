package aulaVetor;

import java.util.Scanner;

public class ExVetor1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vet;
		
		int i,N;
		
		System.out.println("Digite a quantidade de numeros que serão inseridos: ");
		N = sc.nextInt();
		
		vet = new int[N];
		
		for(i=0;i<N;i++) {
				System.out.println("Digite um valor "+ (i+1)+ "/"+ N);
				vet[i]=sc.nextInt();
				
		}
		i=0;
		for(i=0;i<N;i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}

}

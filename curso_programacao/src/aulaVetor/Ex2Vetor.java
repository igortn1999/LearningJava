package aulaVetor;

import java.util.Scanner;

public class Ex2Vetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vet[];
		
		int i, N;
		
		double media=0.0, soma=0.0;
		
		System.out.println("Digite qtd de numeros: ");
		N = sc.nextInt();
		
		vet = new double[N];
		
		for(i=0;i<N;i++) {
			System.out.println("Digite um valor "+ (i+1)+ "/"+ N);
			vet[i]=sc.nextDouble();
			soma+=vet[i];
			
		}
		media= soma/N;
		
		for(i=0;i<N;i++) {
			System.out.print(vet[i]+"\t");
		}
		
		System.out.println("\nSoma:\t"+soma+"\nMedia:\t"+media);
		
		sc.close();
	}

}

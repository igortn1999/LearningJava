package aulaVetor;

import java.util.Scanner;

public class Ex3Vettor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N =?");
		
		int N = sc.nextInt();
		
		double altMed, idMed;
		altMed=idMed=0.0;
		
		int[] idade = new int[N];
		String[] nome= new String[N];
		double[] altura = new double[N];
		
		for(int i=0;i<N;i++){
			System.out.println("Pessoa "+(i+1)+"/"+N);
			System.out.println("Nome: ");
			nome[i]=sc.next();
			System.out.println("Idade: ");
			idade[i]=sc.nextInt();
			System.out.println("Altura: ");
			altura[i]=sc.nextDouble();
			System.out.println("---------------");
			
			altMed+=altura[i];
			
			if(idade[i]<16) {
				idMed++;
			}
		}
		sc.close();
		
		altMed /= N;
		
		idMed = (double) (idMed*100)/N;
		
		System.out.println("Altura media: "+ altMed);
		System.out.println("% de pessoa < 16 anos: "+ idMed + "%");
		
	}

}

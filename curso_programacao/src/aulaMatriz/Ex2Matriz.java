package aulaMatriz;

import java.util.Scanner;

public class Ex2Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		
		double[] vet = new double[M];
		
		double[][] mat = new double[M][N];
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				mat[i][j]=sc.nextDouble();
			}
		}
		
		for(int i=0;i<M;i++) {
			vet[i]=0.0;
			for(int j=0;j<N;j++) {
				vet[i]+=mat[i][j];
				
			}
		}
		
		for(int i=0;i<M;i++) {
			System.out.println(vet[i]);
		}
		
		

	}

}

package aulaMatriz;

import java.util.Scanner;

public class MatrizMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] mat;
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		
		
		mat = new int[M][N];//[linhas][colunas]
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		sc.close();
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
	}

}

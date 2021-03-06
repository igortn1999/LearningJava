package aulaMatriz;

import java.util.Scanner;

public class Ex1Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtd = 0;
		
		int n = sc.nextInt();
		int m = n;
		
		int[][] mat = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=sc.nextInt();
				
				if(mat[i][j]<0){
					qtd++;
				}
			}
		}
		
		System.out.print("Diag. principal: ");
		
		for(int pos = 0;pos<n;pos++) {
			System.out.print(mat[pos][pos]+" ");
		}
	
		System.out.println("\nqtd de numeros negativos: "+qtd);
		sc.close();
	}

}

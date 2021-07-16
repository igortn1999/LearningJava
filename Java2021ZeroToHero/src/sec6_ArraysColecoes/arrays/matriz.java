package sec6_ArraysColecoes.arrays;

import java.util.Iterator;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos?");
		int qtdA=sc.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int qtdN=sc.nextInt();
		
		double[][] notasTurma = new double[qtdA][qtdN];
		
		double total = 0.0;
		
		for(int a =0;a<notasTurma.length;a++){
			for(int n=0;n<notasTurma[a].length;n++) {
				System.out.printf("informe a nota %d do aluno %d ", n+1, a+1);
				notasTurma[a][n] = sc.nextDouble();
				total+=notasTurma[a][n];
			}
		}
		
		double media = total/(qtdA*qtdN);
		System.out.println("Media da turma: "+media);
		
		sc.close();
	}

}

package aulaVetor;

import java.util.Scanner;

public class VetorMain {

	public static void main(String[] args) {
		
		int[] vetI;
		double vetD[];
		String[] vetS;
		
		vetI = new int[10];
		vetD= new double[10];
		vetS = new String[10];
		
		vetS[3]= "Olá";
		
		System.out.println(vetS[3]);
		
		//Exemplo
		
		int N, i;
		int[] vetor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos numeros serão inseridos");
		N=sc.nextInt();
		
		vetor = new int[N];
		
		for(i=0;i<N;i++) {
			System.out.println("Digite o numero para a posição " + i + " do vetor");
			vetor[i]=sc.nextInt();
			
		}
		
		System.out.println("Elemntos do vetor: ");
		
		for(i=0;i<N;i++) {
			System.out.println("Elemento na posição "+ i + ": "+ vetor[i]);
		}
		
		
		//estrutura "para cada" ou "for each"
		System.out.println("Q = ?");
		int Q = sc.nextInt();
		String[] nomes = new String[Q];
		
		for(i=0;i<Q;i++) {
			System.out.println("Nome = ?");
			nomes[i]=sc.next();
		}
		
		System.out.println("Nomes lidos: ");
		
//		for(i=0;i<Q;i++) {
//			System.out.println(nomes[i]);
//		}
//		agora, a mesma coisa que está comentada, mas usando for each: 
		
		for(String s: nomes) {
			System.out.println(s);
		}
		
		
		//sintaxe for each: 
		
//		for(declaracao_tipo_apelido apelido : coleçao, como por exemplo um vetor) {
//			qualquer operaçao usando apelido, que representa o dado sendo tratado no momento
//		}
		
		sc.close();
		
	}

}

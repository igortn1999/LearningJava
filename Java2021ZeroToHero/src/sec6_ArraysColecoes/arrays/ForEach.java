package sec6_ArraysColecoes.arrays;

public class ForEach {

	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		//foreach serve para percorrer o array inteiro, passsando por todos os elementos
		
		for(double nota : notas) {//nota é o elemnto que está no indice atual. notas é o array
			System.out.printf("%.1f\t",nota); // "nota" representa "notas[i]"
		}
		
		//comparação com um for tradicional, que faz a mesma coisa:
		System.out.println("\n");
		
		for(int i=0;i<notas.length;i++) {
			System.out.printf("%.1f\t",notas[i]);
		}
		
	}

}

package sec8_Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		//consumer recebe um parametro e não dvolve nada, apenas faz algum algoritmo interno
		Consumer<ProdutoLambda> imprimir = p -> System.out.println(p.nome); 
		
		ProdutoLambda p1 = new ProdutoLambda("Caneta", 12.34, 0.09);
		imprimir.accept(p1);
		
		ProdutoLambda p2 = new ProdutoLambda("Notebook", 3879.99, 0.25);
		ProdutoLambda p3 = new ProdutoLambda("Caderno", 19.90, 0.03);
		ProdutoLambda p4 = new ProdutoLambda("Borracha", 7.8, 0.18);
		ProdutoLambda p5 = new ProdutoLambda("Lapis", 4.39, 0.19);

		
		List<ProdutoLambda> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.getPreco()));
	}

}

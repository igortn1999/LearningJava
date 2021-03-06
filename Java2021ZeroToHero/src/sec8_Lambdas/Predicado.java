package sec8_Lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
	
	//Predicado recebe 1 unico parametro e retorna true ou false
	Predicate<ProdutoLambda> isCaro =
			produto -> (produto.getPreco() * (1-produto.getDesconto())) >=750;
	
	ProdutoLambda prod = new ProdutoLambda("Notebook", 3999.98, 0.25);
	System.out.println(isCaro.test(prod));
		
	}

}

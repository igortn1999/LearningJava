package sec8_Lambdas.desafio_BinaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import sec8_Lambdas.ProdutoLambda;

public class Desafio_BO {

	public static void main(String[] args) {
		
		ProdutoLambda p = new ProdutoLambda("Ipad", 3235.89, 0.13);
		
		Function<ProdutoLambda, Double> precoFinal =
				prod -> prod.getPreco() *(1- prod.getDesconto());
				
		UnaryOperator<Double> imposto = 
				i -> i >=2500? i*1.085 : i;
				
		UnaryOperator<Double> frete =
				f -> f >=3000.0? f + 100.0 : f + 50;
				
		UnaryOperator<Double> arredondar =
				a -> Double.parseDouble(String.format("%.2f", a));
		
		Function<Double, String> formatar =
				d -> ("R$"+ d).replace(".", ",");
		
		String preco = 
				precoFinal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é: "+ preco);
		
	}

}

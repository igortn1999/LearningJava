package sec8_Lambdas.desafio_BinaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.Function;

import sec8_Lambdas.ProdutoLambda;

public class Desafio_BO {

	public static void main(String[] args) {
		
		ProdutoLambda p = new ProdutoLambda("Ipad", 3235.89, 0.13);
		
		BinaryOperator<Double> precoReal = (preco , desc) -> preco*desc;
		
		BinaryOperator<Double> imposto =
				(valor, imp) -> valor>=500? valor*imp: valor;
				
		BinaryOperator<Double> frete;
		
		String preco = precoFinal.andThen()
		//FALTA COMPLETAR
		
		
		
	}

}

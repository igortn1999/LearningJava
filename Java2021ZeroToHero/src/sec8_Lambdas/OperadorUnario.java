package sec8_Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		
		UnaryOperator<Integer> maisDois = n -> n+2;
		UnaryOperator<Integer> vezesDois = n -> n*2;
		UnaryOperator<Integer> aoQuadrado = n -> n*n;
		
		int resultado = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		System.out.println(resultado);
		
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		System.out.println(resultado2);
		
	}

}

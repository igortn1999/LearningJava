package sec8_Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		//a mesma coisa feita anteriormente, mas com uma 
		//interface do proprio java
		
		BinaryOperator<Double> calc = (x, y) -> {return x+y;};
		System.out.println(calc.apply(2.0, 3.0));
		
	}

}

package sec8_Lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculo calculo = (x, y) -> {return x+y; };
		System.out.println(calculo.executar(2, 3));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.executar(2, 3));
				
	
	}

}

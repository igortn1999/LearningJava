package terceiraAula;

public class Main {

	public static void main(String[] args) {
	
		int a, b;
		double resultado, c;
		
		a=5;
		b=2;
		resultado = a/b; //apesar de resultado ser double, ele identifica a operação com inteiros
		//e corta as casa decimais
				
		System.out.println(resultado);
		//para que isso não ocorra, pode-se fazer um "casting"
		
		resultado = (double) a/b;//casting
		System.out.println(resultado);
		
		c=5.0;
		
		//outro exemplo de casting, para que um int capture o valor de um double
		a=(int) c;
	}

}

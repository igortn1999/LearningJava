package funcoesMatematicas;

public class Main {

	public static void main(String[] args) {
		
		double raiz;
		double elevado;
		double modulo;
		
		raiz = Math.sqrt(9);
		System.out.println(raiz);
		
		elevado = Math.pow(2, 3);
		System.out.println(elevado);
		
		modulo = Math.abs(-4);
		System.out.println(modulo);
		
		double delta = delta(3, 2, 1);
		System.out.println(delta);
	}
	
	public static double delta(double a, double b, double c) {
		double r;
		
		r= (Math.pow(b, 2) -4*a*c);
		
		return r;
		
	}

}

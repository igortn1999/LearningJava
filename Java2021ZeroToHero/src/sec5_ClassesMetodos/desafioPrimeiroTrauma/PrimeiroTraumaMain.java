package sec5_ClassesMetodos.desafioPrimeiroTrauma;

public class PrimeiroTraumaMain {
	
	int a = 3;//não pode mexer

	public static void main(String[] args) {
		
		PrimeiroTraumaMain SAVEME = new PrimeiroTraumaMain();
		//é preciso criar uma instancia para chamar "a" pois "a" não é static 
		
		System.out.println(SAVEME.a);
		
	}

}

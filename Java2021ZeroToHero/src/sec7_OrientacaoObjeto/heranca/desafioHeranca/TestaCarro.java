package sec7_OrientacaoObjeto.heranca.desafioHeranca;

public class TestaCarro {
	
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		Carro civic = new Civic();
		
		System.out.println(ferrari);
		System.out.println(civic);
		System.out.println();
		
		ferrari.acelerar();
		civic.acelerar();
		
		System.out.println(ferrari);
		System.out.println(civic);
		System.out.println();
		
		ferrari.acelerar();
		civic.acelerar();
		
		System.out.println(ferrari);
		System.out.println(civic);
		System.out.println();
		
		ferrari.frear();
		civic.frear();
		
		System.out.println("-----------");
		
		ferrari.ligarTurbo();//se for implementado como Carro Ferrari = new Ferrari(); isso não funciona
							//porque dentro de Carro não há o metodo ligarTurbo
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.desligarTurbo();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		
		
	}
	
}

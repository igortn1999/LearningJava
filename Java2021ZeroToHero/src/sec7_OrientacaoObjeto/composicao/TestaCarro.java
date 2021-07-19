package sec7_OrientacaoObjeto.composicao;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		System.out.println(c1.isLigado());
		c1.ligar();
		System.out.println(c1.isLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println(c1.motor.giros());
		
		
//		c1.motor.fatorInjecao = -30;
//		//falta encapsulamento!!!
		
		
		
	}

}

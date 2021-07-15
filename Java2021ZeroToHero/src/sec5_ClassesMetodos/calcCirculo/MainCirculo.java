package sec5_ClassesMetodos.calcCirculo;

public class MainCirculo {

	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(5.6);
		
		a.pi=9.8;//ao fazer isso, pi está sendo alterado não somente para
				//esta instancia "a" como para toda a classe AreaCirc.
			   //Nesse caso, qualquer instancia que utilize esse valor de pi será afetada pela mudança desse valor.
		
		
		AreaCirc a2 = new AreaCirc(5.6);
		
		a2.pi=999999; //as duas instancias utilizam este valor atribuido, pois foi alterado diretamente no atributo "static"da classe AreaCirc 
		
		System.out.println("Errado:" + a.calculaArea());
		System.out.println("Errado:" + a2.calculaArea());
		
		AreaCirc.pi =3.1415; //como pi é static, isso é a mesma coisa que utilizar a.pi ou a2.pi
		
		System.out.println(AreaCirc.calculaArea(5.6));
		
		
		

	}

}

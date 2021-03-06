package sec5_ClassesMetodos.calcCirculo;

public class AreaCirc {
	
	double raio;
	static double pi=3.14;//static faz com que o valor fique atribuido à classe, e não aos n objetos que podem ser criados a partir dela
						 //static permite também que "pi" possa ser acessado sem que uma instancia dessa classe seja criada. 
						//Em alguns casos, até pode-se utilizar uma variavel estatica, que vai mudando para todas as instancia
					   //Nesse caso, utiliza-se o final, para indicar que pi tem um valor fixo e inalteravel (padrão para constante é caps lock)
	
	static final double PI=3.1415;
	//assim seria mais correto, para que o valor de pi não possa ser alterado
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double calculaArea() {
		return PI*raio*raio;
	}
	
	static double calculaArea(double raioI){
		return PI*raioI*raioI;
	}//Dessa forma, é possivel fazer um calculo de area sem precisar fazer 
	//Uma instância de "AreaCirc".

}

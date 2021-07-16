package sec5_ClassesMetodos.desafioModulo;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(){
		this("Dogla", 80.0);
	}
	
	Pessoa(String nome, double peso){
		
		this.nome = nome;
		this.peso = peso;
		
	}
	
	void comer(Comida comida){
		this.peso+=comida.peso;
	}

}

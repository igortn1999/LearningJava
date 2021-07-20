package sec7_OrientacaoObjeto.encapsulamento;

public class Pessoa {
	
	private int idade;
	
	public Pessoa(int idade) {
		setIdade(idade);
	}
	
	public Pessoa() {
		this(0);
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		if(idade>=0) {
			this.idade = idade;
		}
	}
}

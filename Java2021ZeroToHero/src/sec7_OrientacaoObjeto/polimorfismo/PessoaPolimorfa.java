package sec7_OrientacaoObjeto.polimorfismo;

public class PessoaPolimorfa {
	
private double peso;
	
	public PessoaPolimorfa(double peso) {
		setPeso(peso);
	}
	
	public void comer(ComidaPolimorfa comida) {
		setPeso(this.peso+comida.getPeso());
		comida.setPeso(0.0);
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		if(peso>=0.0) {
			this.peso = peso;			
		}
	}

}

package sec7_OrientacaoObjeto.polimorfismo;

public class ComidaPolimorfa {
	
	private double peso;
	
	public ComidaPolimorfa(double peso) {
		setPeso(peso);
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

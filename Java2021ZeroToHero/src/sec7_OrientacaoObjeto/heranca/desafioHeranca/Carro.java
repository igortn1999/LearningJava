package sec7_OrientacaoObjeto.heranca.desafioHeranca;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int delta = 5;
	
	Carro(){
		this(190);
	}
	
	Carro(int velMax){
		this.VELOCIDADE_MAXIMA = velMax;
	}
	
	double velocidadeAtual = 0.0;
	
	public boolean acelerar() {
		if((velocidadeAtual+delta)>VELOCIDADE_MAXIMA) {
			velocidadeAtual=VELOCIDADE_MAXIMA;
			}
		
		velocidadeAtual+=delta;
		return true;
	}
	
	boolean frear() {
		
		if(velocidadeAtual<=0.0){
			velocidadeAtual=0.0;
			return false;
		}
		velocidadeAtual-=5.0;
		return true;
	}

}

package sec7_OrientacaoObjeto.heranca.desafioHeranca;

public class Civic extends Carro{
	
	@Override
	public boolean acelerar() {
		System.out.println("POW POW POW");
		return super.acelerar();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("A velocidade desse camelo agora é: %.1f", velocidadeAtual);
	}

}

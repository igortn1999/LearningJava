package sec7_OrientacaoObjeto.heranca.desafioHeranca;

public class Ferrari extends Carro implements Esportivo{
	
	public Ferrari(){
		super(320);
	}
	
	@Override

	public boolean acelerar() {
		
		boolean ac1 = super.acelerar();
		boolean ac2 = super.acelerar();
		boolean ac3 = super.acelerar();
		
		return ac1 || ac2 | ac3;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("A velocidade desse possante agora é: %.1f", velocidadeAtual);
	}

	@Override
	public void ligarTurbo() {
		delta = 35;
	}

	@Override
	public void desligarTurbo() {
		delta = 15;
		
	}

}

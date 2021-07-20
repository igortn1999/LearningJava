package sec7_OrientacaoObjeto.encapsulamento;

import sec7_OrientacaoObjeto.heranca.Heroi;
import sec7_OrientacaoObjeto.heranca.Jogador;
import sec7_OrientacaoObjeto.heranca.Monstro;
import sec7_OrientacaoObjeto.heranca.desafioHeranca.Carro;
import sec7_OrientacaoObjeto.heranca.desafioHeranca.Ferrari;

public class TestaTudo {

	public static void main(String[] args) {
		
		Carro c1 = new Ferrari();
		c1.acelerar();
		
		Monstro m1 = new Monstro(4, 5);
		Jogador j1 = new Heroi(5,5);
		
		j1.atacar(m1);
		System.out.println(m1.status());
		
		
	}

}

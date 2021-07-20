package sec7_OrientacaoObjeto.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador j1 = new Heroi(10, 10);
		
		Monstro j2 = new Monstro();
		j2.x = 10;
		j2.y = 11;
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.SUL);
		
		System.out.println(j1.status());
		System.out.println(j2.status());
		
		j1.atacar(j2);
		
		System.out.println(j1.status());
		System.out.println(j2.status());
		
		j2.atacar(j1);
		
		System.out.println(j1.status());
		System.out.println(j2.status());
	}

}

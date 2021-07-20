package sec7_OrientacaoObjeto.heranca;

public class Monstro extends Jogador{
	
	public Monstro(){
		super(0, 0);
	}
	
	public Monstro(int x, int y){
		super(x, y);
	}
	
	@Override
	public boolean atacar(Jogador oponente) {
		
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		//vai tirar 20 de vida pq chama 2x o atacar do super, que tira 10
		
		return ataque1 || ataque2;
	}
}

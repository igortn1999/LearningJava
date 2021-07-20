package sec7_OrientacaoObjeto.heranca;

public class Heroi extends Jogador{
	
	public Heroi(int x, int y){
		super(x, y);
	}
	
	@Override
	public boolean atacar(Jogador oponente){
		
		int deltaX = Math.abs(x-oponente.x);
		int deltaY = Math.abs(y-oponente.y);
		
		if((deltaX==0 && deltaY==1) || (deltaX==1 && deltaY==0)) {
			oponente.vida -= 30;
			return true;			
		}
		
		else return false;
		
	}

}

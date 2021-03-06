package sec7_OrientacaoObjeto.heranca;

public class Jogador {
	
	int vida = 100;
	int x;
	int y;
	
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	
	boolean andar(Direcao d) {
		
		switch(d) {
		
		case NORTE:
			y++;
			return true;
		
		case LESTE:
			x++;
			return true;
		
		case SUL:
			y--;
			return true;
		
		case OESTE:
			x--;
			return true;
			
		default: 
			return false;
		}
		
	}
	
	public boolean atacar(Jogador oponente){
		
		int deltaX = Math.abs(x-oponente.x);
		int deltaY = Math.abs(y-oponente.y);
		
		if((deltaX==0 && deltaY==1) || (deltaX==1 && deltaY==0)) {
			oponente.vida -= 10;
			return true;			
		}
		
		else return false;
		
	}
	
	public String status() {
		return String.format("Vida: %d\nX: %d\nY: %d\n", this.vida , this.x, this.y);
	}
	
	
}

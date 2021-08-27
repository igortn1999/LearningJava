package sect13_JavaSwing.padroes.observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		//todos os interessados serão avisados
		
		//usando a classe criada
		porteiro.registrarObservador(namorada);
		
		//criado via lambda por ser uma interface funcional
		porteiro.registrarObservador(e -> {
			System.out.println("Surpresa via lambda!");
			System.out.println("Ocorreu em "+ e.getMomento());
		});
		
		porteiro.monitorar();
		
		//cada interessado pode decidir como lidar com a informção que recebe
		
	}

}

package sect13_JavaSwing.padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante{

	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		
		System.out.println("Avisar convidados...");
		System.out.println("Apagar as luzes");
		System.out.println("Esperar...");
		System.out.println("Surpresa!!!");
		
		
	}
	
	

}

package sect13_JavaSwing.padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	
	private List<ObservadorChegadaAniversariante> observadores
		= new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante obs){
		observadores.add(obs);
	}
	
	public void monitorar(){
		
		Scanner sc = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)){
			
			System.out.println("Aniversariante chegou?");
			valor = sc.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				//criar evento
				EventoChegadaAniversariante evento 
						= new EventoChegadaAniversariante(new Date());
				
				//notificar observadores
				observadores.stream().forEach(o -> o.chegou(evento));
				valor = "sair";
			}
			else {
				System.out.println("Alarme falso!");
			}
			
		}
		
	}
}

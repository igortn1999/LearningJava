package sect13_JavaSwing.padroes.observer;


@FunctionalInterface
public interface ObservadorChegadaAniversariante {
	
	public void chegou(EventoChegadaAniversariante evento);
}

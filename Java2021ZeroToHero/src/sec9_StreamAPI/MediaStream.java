package sec9_StreamAPI;

public class MediaStream {
	
	private double total;
	private int quantidade;
	
	public MediaStream adicionar(double v) {
		total+=v;
		quantidade++;
		return this;
	}
	
	public double getValor() {
		return total / quantidade;
	}
	
	public static MediaStream combinar(MediaStream m1, MediaStream m2) {
		
		MediaStream resultante = new MediaStream();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		
		return resultante;
	}

}

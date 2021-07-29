package sec9_StreamAPI;

public class MediaStreamTeste {
	
	public static void main(String[] args) {
		
		MediaStream m1 = new MediaStream().adicionar(8.3).adicionar(6.7);
//		m1.adicionar(8.3);
//		m1.adicionar(6.7);
		
		System.out.println(m1.getValor());
		
		MediaStream m2 = new MediaStream().adicionar(7.9).adicionar(6.6);
		System.out.println(m2.getValor());
		
		System.out.println(MediaStream.combinar(m1, m2).getValor());

	}

}

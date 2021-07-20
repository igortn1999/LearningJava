package sec7_OrientacaoObjeto.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaPolimorfa convidado = new PessoaPolimorfa(99.5);
		
		ComidaPolimorfa ingrediente1 = new Arroz(0.200);
		Feijao ingrediente2 = new Feijao(0.100);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		System.out.println(convidado.getPeso());
		
		ComidaPolimorfa sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());

		
		
		
		

	}

}

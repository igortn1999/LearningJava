package sec7_OrientacaoObjeto.composicao.desafio;

public class DesafioTeste {

	public static void main(String[] args) {
		
		Cliente jorge = new Cliente("Jorge");
		
		Compra duasCalcasTresLapis = new Compra();
		
		Item duasCalcas = new Item(new Produto("Tripaloski", 20.39), 2);
		Item tresLapis = new Item(new Produto("Faber Castel", 14.86), 8);
		
		duasCalcasTresLapis.itens.add(duasCalcas);
		duasCalcasTresLapis.itens.add(tresLapis);
		
		jorge.compras.add(duasCalcasTresLapis);
		
		System.out.printf("A compra de %s custou %.2f\n", jorge.nome, jorge.obterValorTotal());
		System.out.printf("Visão geral: \n");
		
		for(Compra compra : jorge.compras) {
			for(Item item : compra.itens) {
				System.out.println("Nome do produto: "+item.produto.nome
									+"\nQuantidade: "+ item.quantidade
									+"\nValor individual: "+ item.produto.preco
									+"\nValor do Item: "+ item.valorItem());
			}
		}
		
		System.out.println("\n MEUAMIGO");
	}

}

package sec5_ClassesMetodos.desafioProduto;

public class TestaProdutoDesafio {

	public static void main(String[] args) {
		
		System.out.println(ProdutoDesafio.precoDesconto(10));
		
		ProdutoDesafio.desconto = 0.50;
		
		System.out.println(ProdutoDesafio.precoDesconto(10));
		
		System.out.println(ProdutoDesafio.precoDesconto(10));
	
	}

}

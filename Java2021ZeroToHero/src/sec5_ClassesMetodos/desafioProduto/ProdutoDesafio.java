package sec5_ClassesMetodos.desafioProduto;

public class ProdutoDesafio {
	
	final static double DESCONTO = 0.25;
	static double desconto = 0.25;
	
	String nome;
	double preco;
	
	ProdutoDesafio() {
		
		nome = "Padrão";
		preco = 1.0;
	}
	
	ProdutoDesafio(String nomeI, double precoI){
		nome = nomeI;
		preco = precoI;
	}
	
	double precoDesconto() {
		return preco*(1-desconto);
	}
	
	static double precoDesconto(double precoI){
		return precoI*(1-desconto);
	}
	
	

}

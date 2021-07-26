package sec8_Lambdas;

public class ProdutoLambda {
	
	final String nome;
	private final double preco;
	private final double desconto;
	
	public ProdutoLambda(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public double getPreco() {
		return preco;
	}

	public double getDesconto() {
		return desconto;
	}
}

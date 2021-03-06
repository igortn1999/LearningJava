package sec5_ClassesMetodos;

public class TestaProduto {

	public static void main(String[] args) {
		
		//Produto produto1 = new Produto(); //Construtor padrão
		
		Produto produto1 = new Produto("Notebook");//Novo construtor
		
//		produto1.nome = "Notebook";//utilizando Construtor padrão, é necessário passar o nome
		produto1.preco = 1299.99;
		produto1.desconto = 0.25;
		
		Produto produto2 = new Produto();//Construtor padrão
		
		produto2.nome = "Caneta Preta";
		produto2.preco = 12.56;
		produto2.desconto = 0.29;
		
		//double precoFinal1 = produto1.desconto * produto1.preco;
		//double precoFinal2 = produto2.desconto * produto2.preco;
		
		//após criação do método para calculo do preco com desconto
		
		double precoFinal1, precoFinal2;
		
		precoFinal1 = produto1.precoComDesconto();
		precoFinal2 = produto2.precoComDesconto();
		
		double mediaCarrinho =(precoFinal1+precoFinal2)/2.0;
		
		System.out.printf("Media carrinho = R$%.2f\n", mediaCarrinho);
		
		Produto p3 = new Produto("Caderno", 29.99, 0.15);//Construtor completo
		
		System.out.printf("%s %s %s %.2f", p3.nome, p3.preco, p3.desconto, p3.precoComDesconto());
		
		
	}

}

package sec5_ClassesMetodos;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(){//Construtor padrão, que já vem de forma implicita assim que se cria a classe
		
	}
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
		
	}
	
	double precoComDesconto() {
		
		return (preco * desconto);
	}

}

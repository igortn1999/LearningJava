package sec9_StreamAPI.desafio_filter;

public class JogoDaSteam {
	
	final String nome;
	final double preco;
	final double desconto;
	final boolean isInWishList;
	
	JogoDaSteam(String nome, double preco, double desconto, boolean isInWishList){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.isInWishList=isInWishList;
	}

}

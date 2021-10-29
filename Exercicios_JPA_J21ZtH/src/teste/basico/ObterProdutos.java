package teste.basico;

import java.awt.desktop.AppReopenedEvent;
import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {
	
	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto p: produtos) {
			System.out.println("ID: "+p.getId()
								+"\tNome:"+p.getNome()
								+"\tPreço:"+p.getPreco());
		}
		
		double precoTotal = produtos.stream()
					.map(p -> p.getPreco())
					.reduce(0.0, (t, p) -> t+p)
					.doubleValue();
		
		System.out.println("Valor total é R$"+ precoTotal);
		
		dao.fechar();
		
	}

}

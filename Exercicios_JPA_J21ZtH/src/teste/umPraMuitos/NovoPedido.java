package teste.umPraMuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umParaMuitos.ItemPedido;
import modelo.umParaMuitos.Pedido;

public class NovoPedido {
	
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Geladeira", 2789.99);
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		dao.abrirTransacao()
				.incluir(produto)
				.incluir(pedido)
				.incluir(item)
				.fecharTransacao().fechar();
		
	}

}

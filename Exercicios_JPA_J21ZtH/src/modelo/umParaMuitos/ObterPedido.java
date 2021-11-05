package modelo.umParaMuitos;

import infra.DAO;

public class ObterPedido {
	
	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		Pedido pedido = dao.obterPorID(4L);
		
		for(ItemPedido item : pedido.getItens()) {//acessando itens 
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());//testando a bidirecionalidade
		}
		
		dao.fechar();
		
	}

}

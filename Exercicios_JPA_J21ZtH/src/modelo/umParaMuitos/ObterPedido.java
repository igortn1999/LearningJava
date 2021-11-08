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
		//vale notar que ele faz duas consultas, uma para receber o pedido e outra para puxar os itens dele
		//isso acontece porque a relação é de UM pedido para MUITOS itens. Quando a relação é PARA MUITOS,
		//o tipo de busca (fetch) é, por padrão "LAZY", o que significa que ele só ira buscar os dados associados
		//caso haja necessidade
		//caso haja uma relação do tipo PARA UM, o tipo de fetch por padrão é EAGER, onde ele já puxa 
		//os itens associados (os filhos) na mesma busca
		dao.fechar();
		
	}

}

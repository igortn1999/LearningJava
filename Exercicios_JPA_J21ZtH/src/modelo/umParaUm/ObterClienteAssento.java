package modelo.umParaUm;

import infra.DAO;

public class ObterClienteAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorID(1L);
		System.out.println(cliente.getAssento().getNome());
		System.out.println(cliente.getAssento().getCliente().getNome());
		//testando a bidirecionalidade criada nas classes. 
		//É possível acessar tanto assento a partir de cliente quanto o cliente a partir do assento
		//O mais importante é que não foi criada uma coluna "cliente_id" na tabela de assentos no DB
		//Isso preserva a integridade dos dados
		daoCliente.fechar();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorID(4L);
		
		System.out.println(assento.getCliente().getNome());
		System.out.println(assento.getCliente().getAssento().getNome());
		
		daoAssento.fechar();
		
		
		
	}
}

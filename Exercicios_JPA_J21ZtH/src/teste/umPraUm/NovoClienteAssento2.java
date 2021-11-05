package teste.umPraUm;

import infra.DAO;
import modelo.umParaUm.Assento;
import modelo.umParaUm.Cliente;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Rodrigo", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
		//agora que a operação em cascata foi implementada, não é necessário fazer a persistencia do assento,
		//as dependencias serão resolvidas automaticamente.
		
		
	}

}

package teste.umPraUm;

import infra.DAO;
import modelo.umParaUm.Assento;
import modelo.umParaUm.Cliente;

public class NovoClienteAssento1 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("23F");
		Cliente cliente = new Cliente("Bia", assento);
		
		DAO<Object> dao = new DAO<>();//DAO utiliza o tipo mais genérico, que é "Object", 
		//para que tanto assento quanto cliente possam ser persistidos pelo mesmo DAO 
		
		dao.abrirTransacao().incluir(assento).incluir(cliente).fecharTransacao().fechar();
		//como a tabela de clientes tem uma coluna ID do assento, é importante que o assento seja inserido antes
		//nesse caso não daria problema porque isso seria resolvido internamente pelo DAO, que percebe a dependência
		//mas se fossem duas transações diferentes, não daria certo
		
		
		
		
	}

}

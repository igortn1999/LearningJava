package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Caneta", 7.45);
		DAO<Produto> dao = new DAO<>();
		
		dao.abrirTransacao().incluir(produto).fecharTransacao();
		//a DAO ajuda a tornar mais facil a interação com o DB
		
		
		Produto produto2 = new Produto("Notebook", 2987.78);
		dao.incluirAtomico(produto2);
		
		Produto produto3 = new Produto("Monitor 23", 789.98);
		dao.incluirAtomico(produto3).fechar();
		
		System.out.println("ID Do produto 3: " + produto3.getId());
		
	}
	
}
	

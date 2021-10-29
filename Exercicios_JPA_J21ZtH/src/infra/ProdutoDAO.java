package infra;

import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto>{
	//é possivel resolver a entidade na hora de instanciar o Produto
	//Aqui seria possivel criar metodos específicos para o produto
	
	public ProdutoDAO() {
		super(Produto.class);
	}
	
}

package modelo.consulta;

import infra.DAO;

public class ObterMediaFilmes {
	
	public static void main(String[] args) {
		
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		NotaFilme nota = dao.consultarUm("obterMediaGeralFilmes");
		
		System.out.println(nota.getMedia());
		
		dao.fechar();
		
	}

}

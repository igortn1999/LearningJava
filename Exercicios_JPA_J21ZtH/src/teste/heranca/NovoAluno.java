package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		
		DAO<Aluno> dao = new DAO<>();
		//não tem problema usar AlunoBolsista nessa DAO porque ele estende Aluno 
		
		Aluno aluno1 = new Aluno(123L, "João");
		AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1000);
		
		dao.incluirAtomico(aluno1);
		dao.incluirAtomico(aluno2);
		
		dao.fechar();
		
	}
}

package teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.muitosParaMuitos.Ator;
import modelo.muitosParaMuitos.Filme;

public class ObterFilmes {

	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		
		//criando uma lista a partir da named query
		List<Filme> filmes = dao.consultar("filmeNotasMaiorQue", "nota", 8.5);
		//consultar("nomeDaCunsulta", "nome do parametro a ser substituido", valor)
		
		for(Filme filme : filmes) {
			System.out.println(filme.getNome() + " -> Nota: " + filme.getNota());
			
			for(Ator ator : filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
		
	}
}

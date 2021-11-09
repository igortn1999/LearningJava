package teste.muitosParaMuitos;

import infra.DAO;
import modelo.muitosParaMuitos.Ator;
import modelo.muitosParaMuitos.Filme;

public class NovoFilmeAtor {
	
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Star Wars ep IV", 8.9);
		Filme filmeB = new Filme("O fugitivo", 8.1);
		
		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator("Carrie Fisher");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		//caso a classe Ator tenha o atributo de cascata na notação ManyToMany, assim como filme tem,
		//o filme irá persistir seus atores, e caso o ator esteja em mais um filme,
		//o outro filme será persistido por consequencia da sua cascata
		
		
		
		
		
	}
}

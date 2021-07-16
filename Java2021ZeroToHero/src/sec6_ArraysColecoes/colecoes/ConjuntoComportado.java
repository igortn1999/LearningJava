package sec6_ArraysColecoes.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> listaAprovados = new HashSet<String>();
		//<Tipo> indica que a lista abriga obrigatoriamente apenas String
//		lista.add(1.2);//não é mais permitido
		
		listaAprovados.add("Carlos");
		listaAprovados.add("Ana");
		listaAprovados.add("Jose");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);//HashSet não mantem a ordem de inserção
		}
		
		//TreeSet mantém a ordem de inserção
		SortedSet<String> listaAprovadosTS = new TreeSet<String>();
		
		listaAprovadosTS.add("Carlos");
		listaAprovadosTS.add("Ana");
		listaAprovadosTS.add("Jose");
		
		for(String candidato : listaAprovadosTS) {
			System.out.println(candidato);//HashSet não mantem a ordem de inserção
		}
		
		
		
	}

}

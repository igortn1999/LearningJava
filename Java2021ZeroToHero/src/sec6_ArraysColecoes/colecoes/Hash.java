package sec6_ArraysColecoes.colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<UsuarioColecoes> usuarios = new HashSet<>();
		
		usuarios.add(new UsuarioColecoes("Pedro"));
		usuarios.add(new UsuarioColecoes("Ana"));
		usuarios.add(new UsuarioColecoes("Guilherme"));
		
		boolean resultado =usuarios.contains(new UsuarioColecoes("Pedro"));
		
		System.out.println(resultado);
		//dá true por causa do Override de Hashcode criado na 
	   //Classe UsuarioColecoes
	}

}

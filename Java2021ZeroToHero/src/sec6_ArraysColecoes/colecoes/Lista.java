package sec6_ArraysColecoes.colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<UsuarioColecoes> lista = new ArrayList<>();
		
		UsuarioColecoes u1 = new UsuarioColecoes("Ana");
		
		lista.add(u1);
		lista.add(new UsuarioColecoes("Carlos"));
		lista.add(new UsuarioColecoes("Lia"));
		lista.add(new UsuarioColecoes("Bia"));
		lista.add(new UsuarioColecoes("Manu"));
		
		System.out.println(lista.get(3).toString());
		//a lista indexa automaticamente os dados
		//é possivel acessar as informações pelo indice
		
		System.out.println(lista.remove(1));
		System.out.println(lista.remove(u1));
		
		System.out.println(lista.contains(new UsuarioColecoes("Lia")));
		
		for(UsuarioColecoes u : lista) {
			System.out.println(u.nome);
			//ordem de inserção foi mantida
		}
		
	}

}
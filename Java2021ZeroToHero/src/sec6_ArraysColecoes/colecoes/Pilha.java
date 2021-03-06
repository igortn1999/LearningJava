package sec6_ArraysColecoes.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println(livro);
		}//faz o for do topo da pilha para baixo
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		System.out.println(livros.remove());//joga excpetion
		System.out.println(livros.pop());//joga exception
		
//		livros.size();
//		livros.clear();
//		livros.isEmpty();
//		livros.contains();
		
	}

}

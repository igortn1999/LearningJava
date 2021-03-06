package sec6_ArraysColecoes.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//offer e add -> Adicionam elementos na fila
		
		fila.add("Ana");//adiciona na fila
		fila.offer("Bia");
		//quando há restrição de tamanho na fila offer retorna falso 
	   //caso não seja possivel adicionar
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		//peek e element -> obter o prox. elemento da fila SEM REMOVER
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		//element é a mesma coisa que peek, mas se a fila estiver 
	   //vazia, ele joga uma exception. Peek retorna null
		
		
		//poll e remove -> obtém o próximo elemento da fila e remove
		
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); //lança exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains(...);
		
		
	}

}

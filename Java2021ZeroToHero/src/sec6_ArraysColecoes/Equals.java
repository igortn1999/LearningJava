package sec6_ArraysColecoes;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Pedro Silva","psilva@email.com");
		Usuario u2 = new Usuario("Pedro Silva","psilva@email.com");
		
		System.out.println(u1==u2);
		//isso dá false porque o espaço alocado na memoria para u1 é ≠ daquele alocado para u2
		//"==" compara os endereços de memoria, e esses são 2 objetos distintos
		
		System.out.println(u1.equals(u2));
		// ".equals"por padrão faz a mesma coisa que "=="
		// é preciso fazer um Override para o ".equals"
		// após a implementação do Override, o equal funciona como desejado
		
	}

}

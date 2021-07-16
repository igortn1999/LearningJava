package sec5_ClassesMetodos;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		//a variavel s1 aponta para um endereço de memória que contém uma String vazia
		System.out.println(s1.concat("!!!!"));
		
		
		//String s2;
	   //A variável s2 não vem com valor padrão porque é uma varável local
	  //dessa forma, ocorre um erro de COMPILAÇÃO (o .class nem chega a ser gerado)
		
		
		String s2 = null;
		//desta forma, o erro é de runtime, e não de compilação
		
		System.out.println(s2.concat("????"));
		
	}
}

//O valor padrão ao inicializar um objeto é null
//quando o objeto é inicializado como nulo, não é possivel acessar nenhum de seus atributos/metodos
//isso ocorre porque não há um espaço na memoria apontado pelo objeto

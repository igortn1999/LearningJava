package sec7_OrientacaoObjeto.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
//		p1.idade = -30;//Quando o atributo é publico, qualquer um pode colocar o que quiser em seus dados
		//para resolver isso, utiliza-se getters e setters

		p1.setIdade(-2);
		System.out.println(p1.getIdade());
		
		p1.setIdade(30);
		System.out.println(p1.getIdade());
		
		Pessoa p2 = new Pessoa();
		System.out.println(p2.getIdade());
		
		Pessoa p3 = new Pessoa(-40);
		System.out.println(p3.getIdade());
		p3.setIdade(40);
		System.out.println(p3.getIdade());
		
		Pessoa p4 = new Pessoa();
		p4.setIdade(45);
		System.out.println(p4.getIdade());
		
	}

}

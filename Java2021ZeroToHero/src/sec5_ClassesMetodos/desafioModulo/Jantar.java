package sec5_ClassesMetodos.desafioModulo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa braia = new Pessoa("Braia", 57);
		Comida borsh = new Comida("Borsh", 5);
		
		System.out.println(braia.nome+" tá magrelo, tem só "+ braia.peso + "Kg");
		System.out.println(braia.nome+" vai comer: "+ borsh.peso + "Kg de " + borsh.nome);
		
		braia.comer(borsh);
		
		System.out.println(braia.nome+" agora tem "+ braia.peso + "Kg");
		
		Pessoa dogla = new Pessoa();
		Comida churro = new Comida();
		
		System.out.println(dogla.nome+" tá magrelo, tem só "+ dogla.peso + "Kg");
		System.out.println(dogla.nome+" vai comer: "+ churro.peso + "Kg de " + churro.nome);
		
		dogla.comer(churro);
		
		System.out.println(dogla.nome+" agora tem "+ dogla.peso + "Kg");
		
	}

}

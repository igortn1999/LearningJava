package sec8_Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional: ");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #1: ");
		
		aprovados.forEach((nome) -> {System.out.println(nome+"!!!");});
		
		aprovados.forEach(nome -> System.out.println(nome+"!!!"));
		
		System.out.println("\nMethod Preference: ");
		
		aprovados.forEach(System.out::println);
		
		System.out.println("\nMetodo Criado" );
		
		aprovados.forEach(nome -> meuImprimir(nome));

	}
	
	static void meuImprimir(String nome) {
		System.out.println("oi, meu nome é "+ nome);
	}

}

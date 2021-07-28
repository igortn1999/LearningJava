package sec9_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<String> print2 = p -> System.out.print(p);
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda\n");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);;
		
		UnaryOperator<String> maiuscula = m -> m.toUpperCase() + "";
		UnaryOperator<String> primeiraLetra = p -> p.charAt(0) + "";
		UnaryOperator<String> grito = g -> g + "!!! ";
		
		System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));
		
		System.out.println("\nUsando composição: ");
		marcas.stream()
		.map(maiuscula)
		.map(primeiraLetra)
		.map(grito)
		.forEach(print);
	}

}

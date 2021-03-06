package sec9_StreamAPI.desafio_map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		Consumer<String> printa = System.out::println;
		Consumer<Integer> printaInt = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Function<Integer, String> binario = b -> b.toBinaryString(b);
		UnaryOperator<String> inverte = inv -> 
		{
			String retorno = "";
			int l = inv.length();
			int fim =l-1;
			
			for(int i=fim; i>=0 ;i--){
				retorno+= inv.charAt(i);
			}
			
			return retorno;
		};
		
		Function<String, Integer> voltaInt = v -> {
			int soma = 0;
			int l =v.length();
			int pot = l-1;
			
			for(int i=0; i<l; i++){
				soma += Integer.parseInt(v.charAt(i)+"")*Math.pow(2, pot);
				pot--;
			}
			
			return soma;
		};
		
		
//		nums.stream().map(binario).forEach(printa);
//		nums.stream().map(binario).map(inverte).forEach(printa);
//		nums.stream().map(binario).map(voltaInt).forEach(printaInt);
		
		nums.stream().map(binario).map(inverte).map(voltaInt).forEach(printaInt);
		
		
//		Function<String, Integer> inverteEvoltaInt = v ->
//		{
//			int soma = 0;
//			int l = v.length();
//			
//			for(int i=0; i<l; i++){
//				soma += Integer.parseInt(v.charAt(i)+"")*Math.pow(2, i);
//			}
//			return soma;
//		};
		
	}

}

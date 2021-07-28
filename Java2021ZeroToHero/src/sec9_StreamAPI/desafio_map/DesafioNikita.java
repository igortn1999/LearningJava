package sec9_StreamAPI.desafio_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioNikita {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		
		Function<Integer, String> toBinary = number -> {
			ArrayList<Integer> binaryList = new ArrayList<>();
			String binary = "";
//			if (number == 1)
//				binary += "00";
//			else if (number < 4)
//				binary += "0";
			int rest, next = number;
			while (next > 1) {
				rest = next % 2;
				binaryList.add(rest);
				next /= 2;
			}
			binaryList.add(next);
			for (int i = binaryList.size(); i > 0; i--)
				binary += binaryList.get(i - 1);
			return binary;
		};
		UnaryOperator<String> revert = text -> {
			String reverseText = "";
			for (int i = text.length(); i > 0; i--)
				reverseText += text.charAt(i - 1);
			return reverseText;
		};
		Function<String, Integer> toInteger = text -> {
			int next = Integer.parseInt(text.charAt(0) + "");
			for (int i = 1; i < text.length(); i++)
				next = next * 2 + Integer.parseInt(text.charAt(i) + "");
			return next;
		};
		nums.stream()
			.map(toBinary)
			.map(revert)
			.map(toInteger)
			.forEach(System.out::println);
		
		for (int num: nums) {
			System.out.printf("%d -> %s -> %s -> %d\n",
					num,
					toBinary.apply(num),
					toBinary.andThen(revert).apply(num),
					toBinary.andThen(revert).andThen(toInteger).apply(num));
		}
		
	}
	
	
	

}

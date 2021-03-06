package sec9_StreamAPI.desafio_filter;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class DesafilterNikita {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the max number for the prime numbers:\n> ");
		int max = input.nextInt();
		for (int i = 1; i < max; i++)
			nums.add(i);
		Predicate<Integer> prime = num -> {
			ArrayList<Integer> primes = new ArrayList<>(1);
			for (int i = 2; i < num; i++) {
				if (i == 2) primes.add(2);
				else {
					if (num % i == 0) return false;
					for (int j = 1; j < primes.size(); j++) {
						if (i % primes.get(j) == 0) break;
						if (j == primes.size() - 1) primes.add(i);
					}
				}
			}
			for (int i = 0; i < primes.size(); i++) {
				if (num % primes.get(i) == 0)
					return false;
			}
			return true;
		};
		Predicate<Integer> biggerThanHalf = num -> num > max / 2;
		nums.stream()
			.filter(prime)
//			.filter(biggerThanHalf)
			.map(num -> num + " is prime and bigger than " + max / 2)
			.forEach(System.out::println);
		
	}

}

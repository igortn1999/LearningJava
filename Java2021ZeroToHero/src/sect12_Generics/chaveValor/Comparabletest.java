package sect12_Generics.chaveValor;

import java.util.TreeSet;

public class Comparabletest {

	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(10);
		nums.add(1);
		nums.add(2);
		nums.add(6);
		nums.add(19);
		nums.add(0);
		nums.add(15);
		nums.add(44);
		nums.add(123);
		nums.add(-13);
		
		for(Integer n : nums) {
			System.out.println(n);
		}
	}
	
}

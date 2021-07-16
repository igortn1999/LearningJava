package sec6_ArraysColecoes.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//um set não aceita tipos primitivos 
		
		conjunto.add(1.2);//double -> Double
		conjunto.add(true);//boolean -> Boolean
		conjunto.add("Teste"); //String já é objeto
		conjunto.add(1);//int -> Integer
		conjunto.add('x');//char -> Character
		
		System.out.println(conjunto.size());
		
		conjunto.add("Teste");//repetido
		
		System.out.println(conjunto.size());//tamanho não muda pq set não permite repetição
		
		System.out.println(conjunto.remove('k'));
		System.out.println(conjunto.remove('x'));

		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1.2));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums);//união
//		conjunto.retainAll(nums);//intersecção
		
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}

package sect10_TratamentoDeErros;

import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {			
			System.out.println(7/sc.nextInt());
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}finally {//sempre é executado, independente de ocorrer o erro ou não
			System.out.println("Finalmente...");
			sc.close();
		}
		
		System.out.println("Fim :D");
		
	}

}

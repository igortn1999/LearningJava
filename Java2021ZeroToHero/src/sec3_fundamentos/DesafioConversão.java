package sec3_fundamentos;

import java.util.Scanner;

public class DesafioConversão {

	public static void main(String[] args) {
		
		double sal=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			
			System.out.printf("Digite o seu salario: "+ (i+1)+"/"+"3\n> ");
			String s = sc.next().replace(',', '.');
			
			sal += Double.parseDouble(s);
			
		}
		
		System.out.println("Media dos ultimos 3 sal.: "+ (sal/3));
				
		sc.close();
	}

}

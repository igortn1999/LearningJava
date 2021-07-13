package estruturarepetitiva;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean loop = true;
		int soma = 0;
		
		while(true) {
			
			while(loop){
				
				System.out.println("Digite um numero para ser somado.\nPara parar, digite '0'");
				int input = sc.nextInt();
				
				if(input==0) {
					loop = false;
				}
				
				soma += input;
				
			}
			
			System.out.println("Valor final: "+ soma);
			break;
		}
		sc.close();
	}

}

package sec3_fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//ler num 1
		//ler num 2
		//ler tipo de operação + - * / % 
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		String operador = sc.next();
		
		double resultado = "+".equals(operador)? num1 + num2 : 
			("-".equals(operador)? num1-num2 :("*".equals(operador)? num1*num2 :
				("/".equals(operador)? num1/num2 :
					("%".equals(operador)? num1%num2 : 0.0))));
		
		System.out.printf("%.2f %s %.2f = %.2f",num1,operador,num2, resultado);
		
		
		
		sc.close();
	}

}

package segundaAula;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 67;
		System.out.println(y);
		
		double x = 14.918273645;
		
		System.out.println(x);
		System.out.printf("%.2f\n", x);//ARREDONDA o número de casas para 2
		Locale.setDefault(Locale.US);//força o padrão americano para que o separador seja '.'e não ','
		System.out.printf("%.2f\n", x);
		
		System.out.println("Resultado: " + x + " metros");
		System.out.printf("Resultado: %.2f metros\n", x);//formatando 
		
		double z = 184.6123132;
		System.out.printf("Resultado: %.2f metros \nAltura: %.2f centimetros \n", x, z);//formatando com mais de uma variavel
		
		String nome = "Maria";
		System.out.printf("Resultado: %.2f metros \nAltura de %s: %.2f centimetros \n", x, nome, z);//formatando com mais de uma variavel de tipos diferentes
		//%s indica que é uma string
		//%f indica que é float
		//assim em diante
		
		ChamaEx chama = new ChamaEx("MacBook Pro", 101, 59999.65);
		
		chama.printa();
		

	}

}

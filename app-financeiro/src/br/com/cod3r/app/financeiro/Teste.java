package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.calculo.Calculadora;

//import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

//para que esse import seja válido, é preciso explicitar isso no module-info.java do projeto (exportador) em questão 
//além disso, é preciso definir explicitamente no module-info do pacote importador que o módulo será requerido


public class Teste {
	
	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(1, 2, 3, 4));
		
		System.out.println(calc.getLoggerClass());
		//precisamos adicionar app-logging ao Build path -> Module path
		
//		OperacoesAritmeticas op = null;//Isso não é possível porque esse pacote não foi exportado nem requerido
	}
	

}

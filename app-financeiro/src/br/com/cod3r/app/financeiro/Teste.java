package br.com.cod3r.app.financeiro;

import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

//import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

//para que esse import seja válido, é preciso explicitar isso no module-info.java do projeto (exportador) em questão 
//além disso, é preciso definir explicitamente no module-info do pacote importador que o módulo será requerido


public class Teste {
	
	public static void main(String[] args) {

//		CalculadoraImpl calc = new CalculadoraImpl();
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		//ao adicionar o uses no module-info de app-financeiro, não há mais dependencia da implementação em sí
		//isso é bom porque se a implementação mudar, não é necessário mudar nada
		
		System.out.println(calc.soma(1, 2, 3, 4));
		
//		System.out.println(calc.getLoggerClass());
		//precisamos adicionar app-logging ao Build path -> Module path
		
//		OperacoesAritmeticas op = null;//Isso não é possível porque esse pacote não foi exportado nem requerido
		
//		OperacoesAritmeticas op = new OperacoesAritmeticas();
//		System.out.println(op.soma(4,5,6));
		
		//duas implementações diferentes de calc baseadas em interface
		CalcImpl1 c1 = new CalcImpl1();
		CalcImpl2 c2 = new CalcImpl2();
		
		System.out.println(c1.soma(1, 2, 3));
		System.out.println(c2.soma(1, 2, 3));
	}
	

}

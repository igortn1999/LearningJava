package br.com.cod3r.app.calculo;

import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

//classe com a intenção de ser visivel para qualquer um
public class Calculadora {
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	//Generate Delegate Method
	public double soma(double... nums) {
		return opAritmeticas.soma(nums);
	}
	
	

}

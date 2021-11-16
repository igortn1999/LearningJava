package br.com.cod3r.app.calculo;

import java.util.Date;

import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.app.logging.Logger;

//classe com a intenção de ser visivel para qualquer um
public class Calculadora {
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	//Generate Delegate Method
	public double soma(double... nums) {
		Logger.info("Somando..."); //precisa criar uma dependencia no build path para chamar essa classe
		//(adicionar app-logging ao build path -> module-path de app-calculo)
		//além disso, precisa adicionar as dependencias nos module-info.java de ambos os pacotes
		
		return opAritmeticas.soma(nums);
	}
	
	public Class<Logger> getLoggerClass(){//Não há acesso à Classe do logger aqui.
		//para resolver isso, usa-se o transitive requires
		//ele será implementado no module-info.java do modulo de calculo
		return Logger.class;
	}
	
	

}

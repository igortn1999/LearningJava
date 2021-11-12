package br.com.cod3r.app.calculo.interno;

import java.util.Arrays;

//classe com a intenção de ser visiviel apenas dentro do pacote
public class OperacoesAritmeticas {
	
	public double soma(double... nums) {
		return Arrays.stream(nums)
				.reduce(0.0, (total, nAtual) -> total + nAtual);
	}

}

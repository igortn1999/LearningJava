package br.com.cod3r.app;

public interface Calculadora {
	
	public double soma(double... nums);
	//queremos que o modulo financeiro não dependa mais da implementação, e sim da interface

}

package sec8_Lambdas;

@FunctionalInterface
public interface Calculo {
//a notação @FunctionalInterface especificar que a interface é utilizada 
//para funções lambda, e que portanto só pode ter um metodo
	
	public abstract double executar(double a, double b);
	//Em interfaces funcionais, pode haver apenas um unico metodo ABSTRATO

}

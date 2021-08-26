package sect12_Generics;

public class CaixaNumeroTeste {
	
	public static void main(String[] args) {
		
//		CaixaNumero<String> caixaA = new CaixaNumero<>();
		//Isso não pode ser feixo porque String não é 
		//um tipo de numero
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardarCoisa(2.3);
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardarCoisa(123);
		System.out.println(caixaB.abrir());
		
	}

}

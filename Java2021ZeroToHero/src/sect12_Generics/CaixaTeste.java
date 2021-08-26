package sect12_Generics;

public class CaixaTeste {
	
	public static void main(String[] args) {
		
//		Caixa caixaA = new Caixa();
		//se for construído sem o parametro do generics, por
		//padrão será assumido o tipo Object
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardarCoisa("Segredo");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardarCoisa(3.1415);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
	}
}

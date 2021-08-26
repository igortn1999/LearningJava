package sect12_Generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		
//		CaixaInt<String> caixaA = new CaixaInt<>();
//		caixaA.guardarCoisa("Teste");
//		caso fosse extendida sem definir o tipo, isso seria possivel
		
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardarCoisa(123);
		
		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		
	}
}

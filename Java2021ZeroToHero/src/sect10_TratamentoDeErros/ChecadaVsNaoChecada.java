package sect10_TratamentoDeErros;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		geraErro1();
		
		try {
			geraErro2();			
		}catch(Exception erro){
			System.out.println(erro.getMessage());
		}
		
		System.out.println("Fim :D");
		
	}
	
	//Não checada ou não verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #1");
		
	}
	//Checada -> é obrigado colocar na assinatura do metodo o "throws"
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #2");
		
	}

}

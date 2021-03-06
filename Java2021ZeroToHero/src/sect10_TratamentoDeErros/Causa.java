package sect10_TratamentoDeErros;

public class Causa {
	
	public static void main(String[] args) {
		
		try {
			metodoA(null);			
		}catch(IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		System.out.println("\n----------------------------");
		metodoA(null);
	}
	
	static void metodoA(AlunoErros aluno) {
		
		try {
			metodoB(aluno);			
		}catch(Exception causa) {
			throw new IllegalArgumentException(causa);
		}
		
	}
	
	static void metodoB(AlunoErros aluno) {
		
		if(aluno==null) {
			throw new NullPointerException("O ALUNO ESTA NULOOO");
		}
		
		System.out.println(aluno.nome);
		
	}

}

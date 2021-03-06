package sect10_TratamentoDeErros;

public class Basico {
	
	public static void main(String[] args) {
		//exceção de runtime ocorre durante a execução do programa
		
		AlunoErros a1 = null;		
		
		try {
			imprimirAluno(a1);			
		
		}catch(Exception excecao) {
			System.out.println("Ocorreu um erro ao imprimir o aluno");
		}
		
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException erro) {
			//sempre é bom sepecificar o tipo de erro que se espera, se possivel
			System.out.println("Ocorreu o erro: "+ erro.getMessage());
		}
		
		System.out.println("Fim :D");
	}
	
	public static void imprimirAluno(AlunoErros aluno) {
		//se alguém passar um aluno nulo, este metodo está vulnerável
		System.out.println(aluno.nome);
		
	}

}

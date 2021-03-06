package sect10_TratamentoDeErros.personalizadaA;

import sect10_TratamentoDeErros.AlunoErros;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			AlunoErros aluno = new AlunoErros("", -7);
			Validar.aluno(aluno);			
		}catch(StringVaziaException erroString) {
			System.out.println(erroString.getMessage());
		}catch(IllegalArgumentException | NumeroForaIntervaloException erroNum) {
			System.out.println(erroNum.getMessage());
		}
		
		Validar.aluno(null);
		
		System.out.println("Fim :D");
		
	}

}

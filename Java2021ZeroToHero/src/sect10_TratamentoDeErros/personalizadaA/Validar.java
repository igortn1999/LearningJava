package sect10_TratamentoDeErros.personalizadaA;

import sect10_TratamentoDeErros.AlunoErros;

public class Validar {
	
	private Validar() {
		
	}
	
	public static void aluno(AlunoErros aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("NOME");
		}
		
		if(aluno.nota <0.0 || aluno.nota > 10.0) {
			throw new NumeroForaIntervaloException("NOTA");
		}
	}

}

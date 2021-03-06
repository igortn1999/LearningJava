package sec9_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	
	public static void main(String[] args) {
		
		AlunoStream a1 = new AlunoStream("Ana", 7.1);
		AlunoStream a2 = new AlunoStream("Luna", 6.1);
		AlunoStream a3 = new AlunoStream("Gui", 8.1);
		AlunoStream a4 = new AlunoStream("Gabi", 10);
		
		List<AlunoStream> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<AlunoStream> melhorNota = (aluno1, aluno2) -> 
		{//1 quer dizer q o primeiro é maior q o segundo
		//-1 quer dizer q o preimeiro é menor que o segundo
	   //0 quer dizer que são iguais
			if(aluno1.nota > aluno2.nota) return 1; 
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		Comparator<AlunoStream> piorNota = (aluno1, aluno2) -> 
		{
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
		
		System.out.println(alunos.stream().max(piorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());

	}

}

package sec9_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		AlunoStream a1 = new AlunoStream("Ana", 7.1);
		AlunoStream a2 = new AlunoStream("Luna", 7.2);
		AlunoStream a3 = new AlunoStream("Gui", 8.1);
		AlunoStream a4 = new AlunoStream("Gabi", 10);
		
		List<AlunoStream> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<AlunoStream> aprovado = ap -> ap.nota >=7.0;
		Predicate<AlunoStream> reprovado = aprovado.negate();
		
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.err.println(alunos.stream().noneMatch(reprovado));
	}

}

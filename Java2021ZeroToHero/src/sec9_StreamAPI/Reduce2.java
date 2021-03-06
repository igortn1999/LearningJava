package sec9_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import sec7_OrientacaoObjeto.composicao.Aluno;

public class Reduce2 {

	public static void main(String[] args) {
		
		AlunoStream a1 = new AlunoStream("Ana", 7.1);
		AlunoStream a2 = new AlunoStream("Luna", 6.1);
		AlunoStream a3 = new AlunoStream("Gui", 8.1);
		AlunoStream a4 = new AlunoStream("Gabi", 10);
		
		List<AlunoStream> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<AlunoStream> aprovado = ap -> ap.nota >=7.0;
		Function<AlunoStream, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		
		alunos.stream().filter(aprovado).map(apenasNota).reduce(somatorio);
	}

}

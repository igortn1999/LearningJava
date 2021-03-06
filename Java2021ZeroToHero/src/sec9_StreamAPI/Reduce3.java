package sec9_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		
		AlunoStream a1 = new AlunoStream("Ana", 7.1);
		AlunoStream a2 = new AlunoStream("Luna", 6.1);
		AlunoStream a3 = new AlunoStream("Gui", 8.1);
		AlunoStream a4 = new AlunoStream("Gabi", 10);
		
		List<AlunoStream> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<AlunoStream> aprovado = ap -> ap.nota >=7.0;
		Function<AlunoStream, Double> apenasNota = a -> a.nota;
		
		BiFunction<MediaStream, Double, MediaStream> calcularMedia =
				(media, nota) -> media.adicionar(nota);
		
		BinaryOperator<MediaStream> combinarMedia = 
				(m1, m2) -> MediaStream.combinar(m1, m2);
				
		MediaStream media = 
				alunos.stream()
				.filter(aprovado)
				.map(apenasNota)
				.reduce(new MediaStream(), calcularMedia, combinarMedia);
		System.out.println("A media dos aprovados da turma é: "
							+ media.getValor());
	}

}

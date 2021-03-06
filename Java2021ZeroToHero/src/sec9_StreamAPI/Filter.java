package sec9_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		AlunoStream a1= new AlunoStream("Ana", 7.8);
		AlunoStream a2= new AlunoStream("Bia", 5.8);
		AlunoStream a3= new AlunoStream("Daniel", 9.8);
		AlunoStream a4= new AlunoStream("Gui", 6.8);
		AlunoStream a5= new AlunoStream("Rebeca", 7.8);
		AlunoStream a6= new AlunoStream("Pedro", 7.8);
		
		List<AlunoStream> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		alunos.stream()
		.filter(a -> a.nota >= 7.0)
		.map(a -> "Parabéns "+ a.nome + "! Você foi aprovado(a)!!!")
		.forEach(System.out::println);
		
		Predicate<AlunoStream> filtraAprovado = f -> f.nota>=7.0;
		
		Function<AlunoStream, String> parabens =
				p ->"Parabéns " + p.nome + "! Você fo aprovado(a)!";
				
		
	}

}

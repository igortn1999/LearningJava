package sec9_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	
	public static void main(String[] args) {
		
		AlunoStream a1 = new AlunoStream("Ana", 7.1);
		AlunoStream a2 = new AlunoStream("Luna", 6.1);
		AlunoStream a3 = new AlunoStream("Gui", 8.1);
		AlunoStream a4 = new AlunoStream("Gabi", 10);
		AlunoStream a5 = new AlunoStream("Ana", 7.1);
		AlunoStream a6 = new AlunoStream("Pedro", 6.1);
		AlunoStream a7 = new AlunoStream("Gui", 8.1);
		AlunoStream a8 = new AlunoStream("Maria", 10);
		
		List<AlunoStream> alunos =
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct: ");
		//por padrão a difereciação é feita a partir do endereço na memoria
		//Precisa implementar o equals e hashCode para fazer a diferenciação personalizada
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)//vai pular dois elementos e depois começar a contar
			.limit(2)//vai contar depois elementos e vai parar
			.forEach(System.out::println);
		
		System.out.println("\nTake/While");
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);
	}

}

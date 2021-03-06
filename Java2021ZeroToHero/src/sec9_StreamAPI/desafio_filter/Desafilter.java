package sec9_StreamAPI.desafio_filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Desafilter {

	public static void main(String[] args) {
		
		JogoDaSteam j1 = new JogoDaSteam("Dark Souls 2, Scholar of the First Sin", 79.99, 95, false);
		JogoDaSteam j2 = new JogoDaSteam("Death's Door", 49.95, 0, true);
		JogoDaSteam j3 = new JogoDaSteam("New World", 74.49, 0, false);
		JogoDaSteam j4 = new JogoDaSteam("My Friend Pedro", 37.99, 0.65, true);
		JogoDaSteam j5 = new JogoDaSteam("Factorio", 50.00, 0, true);
		
		List<JogoDaSteam> jogos = Arrays.asList(j1, j2, j3, j4, j5);
		Function<JogoDaSteam, String> nomeJogo = j -> j.nome;
		
		jogos.stream()
		.filter(j -> j.isInWishList)
		.filter(j -> (j.preco*(1-j.desconto))<=20.00)
		.map(nomeJogo)
		.forEach(System.out::println);
		
	}

}

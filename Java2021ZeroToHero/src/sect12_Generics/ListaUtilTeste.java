package sect12_Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP",
									"C#", "Java");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		
		//Sem utilizar Generics
		
		String ultimaLinguagem = (String) ListaUtil.getUltimoSemGenerics(langs);
		//Como o generics não foi utilizado, o casting é neces-
		//sário, pois o tipo retornado é "Object"
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNum = (Integer) ListaUtil.getUltimoSemGenerics(nums);
		System.out.println(ultimoNum);
		
		
		
		//Agora utilizando Generics:
		
		String lastLang = ListaUtil.getUltimo(langs);
		//agora o casting não é necessário, graças ao generics
		System.out.println(lastLang);
		
		Integer lastNum = ListaUtil.<Integer>getUltimo(nums);
		//mesma coisa que o de cima, mas mais detalhado
		
		System.out.println(lastNum);
		
		
		
		
		
	}

}

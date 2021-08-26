package sect12_Generics;

import java.util.List;

public class ListaUtil {
	
	public static Object getUltimoSemGenerics(List<?> lista) {//Sem usar generics
		//a notação <?> indica que essa lista 
		//pode retornar qualquer coisa
		//<?> = <? Extends Object>
		return lista.get(lista.size()-1);
		//Desta forma, ainda é necessário fazer o casting
	}
	
	public static <T> T getUltimo(List<T> lista){
		return lista.get(lista.size()-1);
	}
	
	public static <A, B, C> C teste(A paramA, B paramB) {
		//exemplo utilizando varios parametros genericos
		C teste =null;
		return teste;
	}
}

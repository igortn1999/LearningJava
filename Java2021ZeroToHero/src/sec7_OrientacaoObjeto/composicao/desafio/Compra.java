package sec7_OrientacaoObjeto.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<>();
	
	double obterValorCompra() {
		double resultado =0.0;
		
		for(Item item : itens) {
			resultado+=item.valorItem();
		}
		
		return resultado;
	}
		
}

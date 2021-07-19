package sec7_OrientacaoObjeto.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	
	ArrayList<Item> itens = new ArrayList<>();
	
	double obteValorTotal() {
		double fim = 0.0;
		for(Item item : itens) {
			fim+=(item.preco*item.quantidade);
		}
		return fim;
	}

}

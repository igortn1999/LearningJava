package sec7_OrientacaoObjeto.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	
	Cliente(String nome){
		this.nome=nome;
	}
	
	Cliente(){
		this("Default");
	}
	
	
	List<Compra> compras = new ArrayList<>();
	
	double obterValorTotal() {
		double resultado=0.0;
		
		for(Compra compra : this.compras) {
			resultado+=compra.obterValorCompra();
		}
		
		return resultado;
	}

}

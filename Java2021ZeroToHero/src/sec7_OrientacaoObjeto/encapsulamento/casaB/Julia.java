package sec7_OrientacaoObjeto.encapsulamento.casaB;

import sec7_OrientacaoObjeto.encapsulamento.casaA.Ana;

public class Julia {

	void testeAcessos() {
		Ana sogra = new Ana();
		
//		System.out.println(sogra.segredo);//só a propria classe
//		System.out.println(sogra.facoDentroDeCasa);//mesmo pacote
//		System.out.println(sogra.FormaDeFalar);//hereditariedade OU mesmo pacote
		System.out.println(sogra.todosSabem);//qualquer um
		
		
	}
}

package sec7_OrientacaoObjeto.encapsulamento.casaB;

import sec7_OrientacaoObjeto.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	Ana mae = new Ana();
	
	void testeAcessos() {
		
//		System.out.println(esposa.segredo);//só a propria classe
//		System.out.println(mae.facoDentroDeCasa);//mesmo pacote
//		System.out.println(mae.FormaDeFalar);//Pedro herda da mãe essa carcteristica, ele a tem, mas não pode acessar a da mãe
		System.out.println(FormaDeFalar);//acesso via herança
		System.out.println(mae.todosSabem);//qualquer um
		System.out.println(todosSabem);//herança também
		
		
	}
	
	
}

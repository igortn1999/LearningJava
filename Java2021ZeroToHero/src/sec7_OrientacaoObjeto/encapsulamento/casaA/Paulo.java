package sec7_OrientacaoObjeto.encapsulamento.casaA;

public class Paulo {
	
	void testeAcessos() {
		Ana esposa = new Ana();
		
//		System.out.println(esposa.segredo);//só a propria classe
		System.out.println(esposa.facoDentroDeCasa);//mesmo pacote
		System.out.println(esposa.FormaDeFalar);//hereditariedade OU mesmo pacote
		System.out.println(esposa.todosSabem);//qualquer um
		
		
	}
}

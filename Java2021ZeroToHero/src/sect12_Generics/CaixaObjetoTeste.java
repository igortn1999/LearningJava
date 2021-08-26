package sect12_Generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		//EXEMPLO SEM GENERICS
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);//double -> Double (auto-boxing)
		
		//Integer coisa = (Integer) caixaA.abrir();
		Double coisa = (Double) caixaA.abrir();
		//se o objeto criado para armazenar o objeto dentro da caixa não for do mesmo
		//tipo que foi guardado dentro dela, o casting vai dar problema
		
		//o Casting precisa ser feito pq o metodo abrir retorna um tipo Object
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
	}

}

package sec5_ClassesMetodos;

import sec5_ClassesMetodos.desafioClasseData.ClasseData;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a=2.0;
		double b = a;//atribuição por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a +" "+ b);
		
		ClasseData d1 = new ClasseData();
		
		ClasseData d2 = d1;//Atribuição por referencia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		 //como a atribuição foi feita por referencia, tanto d1 quanto d2 referenciam o mesmo objeto em memoria
		//isso significa que a alteração feita em um, afeta diretamente o outro.
		
	}

}

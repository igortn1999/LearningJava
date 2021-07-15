package sec5_ClassesMetodos.thisEThis;

public class TestaClasseDataThis {

	public static void main(String[] args) {
		
		ClasseDataThis data1 = new ClasseDataThis();
		
		data1.dia = 13;
		data1.mes = 11;
		data1.ano = 1999;
		
		ClasseDataThis data2 = new ClasseDataThis();
		
		data2.dia = 14;
		data2.mes = 12;
		data2.ano = 1963;
		
		System.out.println(data1.obterData());
		System.out.println(data2.obterData());
		
		ClasseDataThis data3 = new ClasseDataThis();
		System.out.println(data3.obterData());
		
		ClasseDataThis data4 = new ClasseDataThis(31, 12, 1814);
		System.out.println(data4.obterData());
	}

}

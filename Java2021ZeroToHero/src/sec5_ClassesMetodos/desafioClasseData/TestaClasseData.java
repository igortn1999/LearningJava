package sec5_ClassesMetodos.desafioClasseData;

public class TestaClasseData {

	public static void main(String[] args) {
		
		ClasseData data1 = new ClasseData();
		
		data1.dia = 13;
		data1.mes = 11;
		data1.ano = 1999;
		
		ClasseData data2 = new ClasseData();
		
		data2.dia = 14;
		data2.mes = 12;
		data2.ano = 1963;
		
		System.out.println(data1.obterData());
		System.out.println(data2.obterData());
		
		ClasseData data3 = new ClasseData();
		System.out.println(data3.obterData());
		
		ClasseData data4 = new ClasseData(31, 12, 1814);
		System.out.println(data4.obterData());
	}

}

package sec5_ClassesMetodos.desafioClasseData;

public class ClasseData {
	
	public int dia;
	public int mes;
	public int ano;
	
	public ClasseData(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	ClasseData(int diaI, int mesI, int anoI){
		dia = diaI;
		mes = mesI;
		ano = anoI;
	}
	
	public String obterData() {
		
		String data =String.format("%d/%d/%d", dia, mes, ano);
		
		//Metodo Nikita:
		//String data = dia + "/" + mes + '/'+ ano;
		
		return data;
	}
}

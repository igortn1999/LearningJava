package sec5_ClassesMetodos.thisEThis;

public class ClasseDataThis {
	
	public int dia;
	public int mes;
	public int ano;
	
	public ClasseDataThis(){
		
//		this.dia = 1;
//		this.mes = 1;
//		this.ano = 1970;
		
		this(1, 1, 1970);//chama o outro construtor a partir de um construtor
	}
	
	ClasseDataThis(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String obterData() {
		
		String data =String.format("%d/%d/%d", dia, mes, ano);
		
		//Metodo Nikita:
		//String data = dia + "/" + mes + '/'+ ano;
		
		return data;
	}

	//Não é possivel usar "this." em um atributo estatico, pois "this"se referencia à instância
//	static void teste() {
//		this.dia = 3;
//	}
	
}

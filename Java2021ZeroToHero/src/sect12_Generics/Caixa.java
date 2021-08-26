package sect12_Generics;

public class Caixa<TIPO> {
	//Notação to Generics <Representação_Tipo_Generico>
	
	private TIPO coisa;
	
	public void guardarCoisa(TIPO coisa) {
		this.coisa = coisa;
		
	}
	
	public TIPO abrir() {
		return this.coisa;
	}
	
	//Ao substituir "Object" por "TIPO", os metodos vão sempre
	//trabalhar com o tipo que é especificado na hora de construir
	//a classe ou chamar os metodos
	
	
}

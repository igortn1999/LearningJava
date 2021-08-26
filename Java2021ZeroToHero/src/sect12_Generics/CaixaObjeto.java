package sect12_Generics;

public class CaixaObjeto {
	//EXEMPLO SEM GENERICS
	
	private Object coisa;
	
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return coisa;
	}
}

package sec7_OrientacaoObjeto.abstrato;

public abstract class Animal {
	
	public String respirar(){
		return "CO2";
	}
	
	public abstract String mover();//cada animal pode se mover de forma diferente
								  //então a classe abstrata deixa a criterio de suas
								 //herdeiras como elas irão decidir se mover

}

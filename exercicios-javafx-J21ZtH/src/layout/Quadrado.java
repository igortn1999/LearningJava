package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle{
	
	private static int i = 0;
	//i é estático porque é um valor que será compartilhado entre todas as instancias de Caixa
	//dessa forma cada nova caixa criada será criada com uma cor diferente, com base no funcionamento do contrutor
	
	private String[] cores = {
			"#c33c5e", "#39aac6", "#28d79a",
			"#fb750e", "#6657a8", "#f9060e"
	};
	
	public Quadrado() {
		this(100);
	}
	
	public Quadrado(int tamanho){
		//setando altura e largura mínimos (a caixa pode expandir para além desse tamanho)
		setWidth(tamanho);
		setHeight(tamanho);
		
		//Criando o background
		setFill(Color.web(cores[i++]));
		
		if(i==6) i=0;
	}

}

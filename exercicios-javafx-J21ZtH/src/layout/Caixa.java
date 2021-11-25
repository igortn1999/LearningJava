package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox{
	
	private static int i = 0;
	//i é estático porque é um valor que será compartilhado entre todas as instancias de Caixa
	//dessa forma cada nova caixa criada será criada com uma cor diferente, com base no funcionamento do contrutor
	
	private String[] cores = {
			"#c33c5e", "#39aac6", "#28d79a",
			"#fb750e", "#6657a8", "#f9060e"
	};
	
	public Caixa() {
		this(100, 100);
	}
	
	public Caixa(int largura, int altura){
		setAlignment(Pos.CENTER);//elementos serão alinhados ao centro da caixa
		//setando altura e largura mínimos (a caixa pode expandir para além desse tamanho)
		setMinWidth(largura);
		setMinHeight(altura);
		
		//Criando o background
		BackgroundFill fill = new BackgroundFill(Color.web(cores[i++]), CornerRadii.EMPTY, Insets.EMPTY);
		//Color.web é um método que recebe uma String como parâmetro para setar a cor
		//passando cores[i++] como parâmetro, será usada a cor na posição i e só depois sera somado 1 ao valor de i
		setBackground(new Background(fill));
		
		if(i==6) i=0;
	}
	
	public Caixa comTexto(String texto) {
		Label label = new Label(texto);
		label.setFont(new Font(24));
		getChildren().add(label);
		return this;//por esse método retornar a própria caixa, ele pode ser chamado junto ao construtor na hora 
		//de instanciar o objeto
	}

}

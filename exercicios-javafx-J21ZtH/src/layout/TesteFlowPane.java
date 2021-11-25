package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane{
	//adiciona um ao lado do outro (na horizontal, esquera p/ direita por padrão), com quebra automatica de linha
	
	public TesteFlowPane() {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
		
		setHgap(10);//espaço entre os elementos no eixo horizontal 
		setVgap(10);//espaço entre os elementos no eixo vertical
		
		setPadding(new Insets(10));//padding para desgrudar os elementos da borda da janela
		//esse construtor de Insets seta o mesmo padding para todos os lados
		
		setOrientation(Orientation.VERTICAL);//setando para adicionar os elementos um abaixo do outro
		setAlignment(Pos.CENTER_RIGHT);//setando para adicionar os elemnentos da direita para a esquerda
		
		getChildren().addAll(q1, q2, q3, q4, q5);
	}

}

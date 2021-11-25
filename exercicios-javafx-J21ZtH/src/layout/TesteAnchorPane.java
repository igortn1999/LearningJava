package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TesteAnchorPane extends AnchorPane{
	
	public TesteAnchorPane() {
		
		Quadrado q1 = new Quadrado();//ancoragem é feita, por padrão, no canto superior esquerdo
		setTopAnchor(q1, 10.0);//Ancorar o elemento q1 a 10px da linha superior
		setLeftAnchor(q1, 10.0);//Ancorar o elemento q2 a 10px da lateral esquerda
		
		Quadrado q2 = new Quadrado();
		setTopAnchor(q2, 10.0);
		setRightAnchor(q2, 10.0);
		
		Quadrado q3 = new Quadrado();
		setBottomAnchor(q3, 10.0);
		setLeftAnchor(q3,10.0);
		
		Quadrado q4 = new Quadrado();
		setBottomAnchor(q4, 10.0);
		setRightAnchor(q4, 10.0);
		
		Quadrado q5 = new Quadrado();
//		setTopAnchor(q1, 250.0);//tentativa de centralização da caixa
//		setLeftAnchor(q1, 300.0);//essa estratégia não é boa, o Anchor Pane não é muito bom para centralização
		
		HBox centro = new HBox();//outra estratégia melhor para centralizar um elemento no AnchorPane
		centro.setAlignment(Pos.CENTER);
		setTopAnchor(centro, 110.0);//110.0 é o tamanho da caixa padrão + 10 de margem
		setBottomAnchor(centro, 110.0);
		setLeftAnchor(centro, 110.0);
		setRightAnchor(centro, 110.0);
		
		centro.getChildren().add(q5);//adicionando q5 ao HBox para mantê-lo centralizado
		
		getChildren().addAll(q1, q2, q3, q4);
//		getChildren().add(q5);
		getChildren().add(centro);//assim, mesmo que o tamanho da janela varie, q5 sempre estará no centro
		
	}

}

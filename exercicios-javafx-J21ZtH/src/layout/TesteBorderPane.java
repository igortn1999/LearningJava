package layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane{
	
	public TesteBorderPane() {
		
		Caixa c1 = new Caixa().comTexto("Topo");
		setTop(c1);//já adiciona automaticamente dentro do Children
		
		Caixa c2 = new Caixa().comTexto("Esquerda");
		setLeft(c2);
		
		Caixa c3 = new Caixa().comTexto("Direita");
		setRight(c3);
		
		Caixa c4 = new Caixa().comTexto("Fundo");
		setBottom(c4);
		
		Caixa c5 = new Caixa().comTexto("Meio");
		setCenter(c5);
		
	}

}

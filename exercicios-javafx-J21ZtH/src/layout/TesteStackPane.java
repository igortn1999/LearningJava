package layout;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane{
	//Stack pane adiciona os elementos em pilha (um "em cima" do outro)(sobreposição)
	
	public TesteStackPane() {
		
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		getChildren().addAll(c2, c3, c4, c5, c6, c1);//c1 é adicionado por ultimo para que 
													//ele seja exibido na tela assim que o programa abrir
		
		this.setOnMouseClicked(e -> {
			if(e.getSceneX() > (getScene().getWidth() / 2)) {
				//clicou do lado direito
				getChildren().get(0).toFront();//mandar o primeiro item para a o topo da pilha
				
			}else {
				//lado esquerdo
				getChildren().get(5).toBack();
			}
		});
		
		Thread t = new Thread( () -> {//criando uma thread para que o Stackpane alterne entre caixas automaticamente
			while(true) {
				try {
					Thread.sleep(3000);
					//Criando a Thread do Java FX
					Platform.runLater( () -> {//runLater vai rodar os metodos do JavaFx no momento certo para que fincionem 						
						getChildren().get(0).toFront();//isso não funciona se ele não estiver em uma Thread do JavaFX
					});
					
				} catch (InterruptedException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		
		t.setDaemon(true);//Se a thread pricnipal da aplicação morrer, essa também deve
		t.start();
	}
	
}

package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application{

	//Primeiramente, adicionar o JAvaFx em Eclipse preferences -> Java -> Build Path -> User Libraries
	//Uma boa pratica é adicionar, neste ponto, para cada jar, o source attachment (src.zip)
	//isso permite que haja acesso a mais informações como implementações de métodos, além de acesso ao codigo fonte
	
	//depois, adicionar a biblioteca do JavaFx no Build Path -> Library do projeto java
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Assim como um peça de teatro, existe um palco que pode abrigar diversas cenas
		//(apenas uma cena será exibida por vez)
		
		//Criando um Box vertical com três botões
		VBox box = new VBox();
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		//setando funções para os botões
		botaoA.setOnAction(e -> System.out.println("A"));//imprime "A"
		botaoB.setOnAction(e -> System.out.println("B"));//imprime "B"
		botaoC.setOnAction(e -> System.exit(0));//fechar o programa
		
		box.setAlignment(Pos.CENTER);//alterar posição dos elementos dentro da janela
		box.setSpacing(10);//alterar espaçamento entre os elementos do box
		
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		//criando uma cena
		Scene unicaCena = new Scene(box, 100, 150);//criando uma scena que abrigará o box criado.
		//O box terá dimensões de 100x150 (lxh)
		
		//setando a cena que será exibida no stage
		primaryStage.setScene(unicaCena);
		//mostrando a janela 
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
		//depois de rodar o main uma vez, desmarcar nos argumentos no run configuration dessa classe 
		//a checkbox de SWT
		
		//ocorrerá uma exception por causa das propriedades do modulo, que impede que seja feita uma java reflection
		//para impedir isso, precisamos indicar no module-info que ele abre o pacote "basico"
		
		//após essa configuração, uma janela deve abrir ao rodar o programa
		
	}

}

package basico;

//lembrar de tomar muito cuidado com os imports, usar sempre os do JAVAFX
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{
	
	private int contador = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Criando labels
		Label labelTitulo = new Label("Contador");
		Label labelNumero = new Label("0");
		
		//Criando botões
		Button botaoDecremento = new Button("-");
		Button botaoIncremento = new Button("+");
		
		//Criando um box horizontal para abrigar os botões um do lado do outro
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);//centralizando itens no box dos botões
		boxBotoes.setSpacing(10);//espaçamento entre os botões
		//Adicionando botões ao box 
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		//Criando o box principal
		VBox boxPrincipal = new VBox();
		boxPrincipal.setAlignment(Pos.CENTER);//centralizando itens no box principal
		boxPrincipal.setSpacing(10);//adicionando espaçamento entre os intens do box
		//Adicionando os labels ao box principal
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(boxBotoes);//Adicionando o box dos botões ao box principal
		
		//Criando a cena principal da aplicação
		Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400);
		primaryStage.setScene(cenaPrincipal);//setando a cena principal como a cena a ser mostrada
		primaryStage.show();//mostrar a aplicação
		
		//Logica de Incrementar e decrementar a o numero da label a partir dos botões
		botaoDecremento.setOnAction(e -> {
			contador--;
			labelNumero.setText(Integer.toString(contador));
		});
		botaoIncremento.setOnAction(e -> {
			contador++;
			labelNumero.setText(Integer.toString(contador));
		});
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);//chamar a aplicação
	}

}
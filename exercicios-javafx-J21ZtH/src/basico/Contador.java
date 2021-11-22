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
		labelTitulo.getStyleClass().add("titulo");//adicionando o estilo usando a classe CSS
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");//adicionando o estilo usando a classe CSS
		
		//Criando botões
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");//adicionando o estilo usando a classe CSS
		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");//adicionando o estilo usando a classe CSS
		
		//Criando um box horizontal para abrigar os botões um do lado do outro
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);//centralizando itens no box dos botões
		boxBotoes.setSpacing(10);//espaçamento entre os botões
		//Adicionando botões ao box 
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		//Criando o box conteudo
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");//nome da classe CSS
		boxConteudo.setAlignment(Pos.CENTER);//centralizando itens no box principal
		boxConteudo.setSpacing(10);//adicionando espaçamento entre os intens do box
		//Adicionando os labels ao box de conteudo
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);//Adicionando o box dos botões ao box de conteudo
		
		//Para fazer a personalização de estilo, foi criado dentro do pacote o arquivo Contador.css
		//pegando o caminho do arquivo css (a raiz nesse caso é diretório atual da classe)
		String caminhoCss = getClass().getResource("/basico/Contador.css").toExternalForm();
		//Criando a cena principal da aplicação
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoCss);//aplicando o CSS
		//importando a fonte, pega a partir do google fonts
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		primaryStage.setScene(cenaPrincipal);//setando a cena principal como a cena a ser mostrada
		primaryStage.show();//mostrar a aplicação
		
		//Logica de Incrementar e decrementar a o numero da label a partir dos botões
		botaoDecremento.setOnAction(e -> {
			contador--;
			labelNumero.setText(Integer.toString(contador));
			atualizarCor(labelNumero);
		});
		botaoIncremento.setOnAction(e -> {
			contador++;
			labelNumero.setText(Integer.toString(contador));
			atualizarCor(labelNumero);
		});
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);//chamar a aplicação
	}
	
	public void atualizarCor(Label labelNumero){
		
		labelNumero.getStyleClass().remove("verde");
		labelNumero.getStyleClass().remove("vermelho");
		
		if(this.contador > 0) {
			labelNumero.getStyleClass().add("verde");
		}else if(this.contador < 0) {
			labelNumero.getStyleClass().add("vermelho");
		}
	}

}

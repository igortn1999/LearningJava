package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application{
	//instalar o plug-in de FXML no marketplace, e(fx)clipse
	//tendo ele instalado, já deve ser possível criar um arquivo fxml dentro do pacote

	@Override
	public void start(Stage primaryStage) throws Exception {
		//importando o arquivo CSS
		String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm();
		
		//importando o arquivo .fxml criado
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
		//instanciando um GridPane a partir do fxml criado
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		Scene cena = new Scene(raiz, 350, 350);
		cena.getStylesheets().add(arquivoCSS);//aplicando CSS, agora ele pode ser utilizado no arquivo FXML
		
		primaryStage.setResizable(false);
		primaryStage.setTitle("Tela de Login");
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}

package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application{
	
	//criando uma janela que terá váras cenas; cada uma seria um "passo" numa config. com Wizard
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;

	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;//primary stage será nossa janela
		
		//criar todas as cenas dos passos atrvés dos métodos criados
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		janela.setScene(passo1);//setar o passo1 como a cena que está sendo exibida
		
		janela.setTitle("Wizard");//adicionando nome à janela
		janela.show();//mostrando a janela
	}
	
	private void criarPasso1() {//criando a cena que representa o primeiro passo
		//criando um botão para ir para o passo seguinte
		Button proximoPasso = new Button("Ir p/ Passo 2 >>");
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo2);//adicionando função de mudar para a cena 2 ao clicar no botão
			janela.setTitle("Wizard :: Passo 2");
		});
		//criando um box para abrigar o botão
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);//definindo alinhamento
		box.getChildren().add(proximoPasso);//adicionando o botão ao box
		
		//Instanciando a cena, utilizando o box como elemento raiz e dimensões 400x400 para a cena
		this.passo1 = new Scene(box, 400, 400);
		
	}
	
	private void criarPasso2() {//criando passo 2
		//botao para voltar para o passo anterior
		Button passoAnterior = new Button("<< Voltar p/ Passo 1");
		passoAnterior.setOnAction(e ->{
			janela.setScene(passo1);//voltar para a cena 1
			janela.setTitle("Wizard");
		});
		//botao próximo passo
		Button proximoPasso = new Button("Ir p/ Passo 3 >>");
		proximoPasso.setOnAction(e ->{
			janela.setScene(passo3);
			janela.setTitle("Wizard :: Passo 3");
		});
		
		//criando um box para abrigar o botão
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		//adicionando o botões ao box
		box.getChildren().add(passoAnterior);
		box.getChildren().add(proximoPasso);
		
		this.passo2 = new Scene(box, 400, 400);
		
	}

	private void criarPasso3() {//passo 3
		//botao para voltar para o passo anterior
		Button passoAnterior = new Button("<< Voltar p/ Passo 2");
		passoAnterior.setOnAction(e ->{
			janela.setScene(passo2);
			janela.setTitle("Wizard :: Passo 2");
		});
		//botao próximo passo
		Button proximoPasso = new Button("Finalizar");
		proximoPasso.setOnAction(e ->{
			System.exit(0);//finalizar aplicação com sucesso
		});
		
		//criando um box para abrigar o botão
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		//adicionando o botões ao box
		box.getChildren().add(passoAnterior);
		box.getChildren().add(proximoPasso);
		
		this.passo3 = new Scene(box, 400, 400);
		
	}
	
	public static void main(String[] args) {
		launch(args);
		//não esquecer de mudar a configuração dos argumentos no run configuration (precisa rodar uma vez)
		//desmarcar a opção do SWT
		
		
	}

}

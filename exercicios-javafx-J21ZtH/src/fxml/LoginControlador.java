package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	//O xml é bom para definir a estrutura de uma interface visual, mas não para criar código
	
	//O controlador é uma classe que controla o fluxo da aplicação, ficando entre a view e o modelo,
	//capturando as informações necessárias da tela para chamar a "camada de negócio".
	
	@FXML//Anotação que indica que esse campo pertence ao arquivo FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {//função que será chamada ao apertar o botão
		boolean emailValido = campoEmail.getText().equals("aluno@cod3r.com.br");
		boolean senhaValida = campoSenha.getText().equals("12345678");
		
		//para fazer a parte de controle, foi baixado o jar do controlsfx. A ultima release pode ser consultada
		//no github, e depois basta pesquisar o numero da versão e baixar o .jar
		//depois, basta criar uma pasta lib nesse projeto java e adicionar no build path
		//também é necessário adicioná-lo ao module-path
		if(emailValido && senhaValida) {
			//agora que o controlsfx foi importado, podemos utilizar suas Classes
			Notifications.create()
						 .position(Pos.TOP_RIGHT)
						 .title("Login FXML")
						 .text("Login efetuado com sucesso")
						 .showInformation();
		}
		else {
			Notifications.create()
						 .position(Pos.TOP_RIGHT)
						 .title("Login FXML")
						 .text("Usuário e/ou Senha inválidos!")
						 .showError();
		}
	}
	
	
}
















module exerciciosfx {
	requires javafx.controls;
	requires javafx.graphics;//necessário para utilizar Application do Javafx na classe Primeirofx
	requires javafx.fxml;
	requires org.controlsfx.controls;//importando o controlsfx, jar baixado
	
	opens basico;//permitir que o pacote basico sofra java reflection
	opens layout;
	opens fxml;
}
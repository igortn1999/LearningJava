module exerciciosfx {
	requires javafx.controls;
	requires javafx.graphics;//necessário para utilizar Application do Javafx na classe Primeirofx
	
	opens basico;//permitir que o pacote basico sofra java reflection
	opens layout;
}
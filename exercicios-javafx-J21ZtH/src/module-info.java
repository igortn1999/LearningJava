module exerciciosfx {
	requires javafx.controls;//necessário para utilizar Application do Javafx na classe Primeirofx
	
	opens basico;//permitir que o pacote basico sofra java reflection
}
package calculo;

public class Teste {
	
	public static void dizOpa() {//método para testar exportação
		System.out.println("Opa");
	}
	//para exportar um arquivo java, basta clicar com o direito no arquivo java e clicar em "Export..."
	//Todo projeto que tem uma classe com método main pode ser exportado como "Runnable Jar File"
	//no caso, de exportação para ser usado em outro projeto,
	//este projeto é exportado como apenas como Jar
	//esse jar poderia ser utilizado como uma lib no projeto app-financeiro
	
	//ao adiciona-lo às libs do app-financeiro, basta clicar com o direito nele e adicionar ao build-path
	
	
	public static void main(String[] args) {
		dizOpa();
		//Agora que esta classe tem um método main,
		//este projeto pode ser exportado como Runnable JAR file
	}
	
	//Para evitar de ter que fazer todo esse processo de exportar novamente a cada alteração, 
	//serão configuradas dependencias entre os pacotes 
	//(adicionando ao module-path ao inves de class-path) dentro build path, na aba PROJECTS
	
	
}

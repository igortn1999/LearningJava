package sect15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//todos os imports serão interfaces do java.sql
public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		//string que representa o local para acessar o DB:
		//				  jdbc:<driver>:<endereço>:<porta>/<database>?<opções>
		
//		final String url = "jdbc:mysql://localhost";//pode omitir a porta se ela for a porta padrão
//		final String url = "jdbc:mysql://localhost:3306";//padrao
//		final String url = "jdbc:mysql://localhost:3306?useSSL=false";//isso desabilita a conexão segura
//		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSl=true";//usa conexão segura (SSL) mas não verifica certificado do servidor
		
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSl=true";
		
		final String usuario = "root";
		final String senha = "root";
		
		//o driver foi baixado e o seu .jar foi colocado dentro
		//da pasta 'lib' que criei 
		
		//.jar significa "java archive", é basicamente um arquivo zip que contém varios .class
		
		//é necessário adicionar o driver ao build path depois de coloca-lo em 'lib'
		//para poder usar suas funções
		
		Connection conexao = 
				DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conectou!");
		
		conexao.close();
		
	}
	
}

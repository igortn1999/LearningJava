package sect15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//todos os imports serão interfaces do java.sql
public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		//string que representa o local para acessar o DB:
		//				  jdbc:<driver>:endereço:porta
		final String url = "jdbc:mysql://localhost:3306";
		
		final String usuario = "root";
		final String senha = "root";
		
		Connection conexao = 
				DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conectou!");
		
		conexao.close();
		
	}
	
}

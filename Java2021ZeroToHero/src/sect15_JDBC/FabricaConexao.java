package sect15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao{
	
	public static Connection getConnection(){
		try {
			String url = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
			String usuario = "root";
			String senha = "root";
			
			return DriverManager.getConnection(url, usuario, senha);
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	
	}

}

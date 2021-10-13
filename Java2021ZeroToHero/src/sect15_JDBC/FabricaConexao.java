package sect15_JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao{
	
	public static Connection getConnection(){
		try {
			Properties prop = getProperties();
			
			String url = prop.getProperty("banco.url");
			String usuario = prop.getProperty("banco.usuario");
			String senha = prop.getProperty("banco.senha");
			
			return DriverManager.getConnection(url, usuario, senha);
			
		}catch(SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	
	}
	
	private static Properties getProperties() throws IOException{
		String caminho ="/conexao.properties"; 
		Properties prop = new Properties();
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}

}

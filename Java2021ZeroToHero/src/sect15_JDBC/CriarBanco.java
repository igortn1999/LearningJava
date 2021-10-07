package sect15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
	public static void main(String[] args) throws SQLException{
		
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSl=true";
		final String usuario = "root";
		final String senha = "root";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		//Criando banco de dados
		
		//lembrar que os imports vêm de java.sql
		Statement stmt = conexao.createStatement();//criar um statement em SQL 
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");//executar statement
		
		System.out.println("Banco criado com sucesso!");
		
		conexao.close();
	
	}
	

}

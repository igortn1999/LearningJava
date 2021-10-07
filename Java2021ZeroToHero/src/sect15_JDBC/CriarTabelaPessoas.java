package sect15_JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	
	public static void main(String[] args) throws SQLException{
		Connection conexao = FabricaConexao.getConnection();
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoas("
				+ "CODIGO INT AUTO_INCREMENT PRIMARY KEY,"
				+ "NOME VARCHAR(80) NOT NULL"
				+ ");";
				
		//é preciso tomar cuidado com o Statement, pois é vulnerável ao SQL Injection
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		
		System.out.println("Tabela criada com sucesso");
		conexao.close();
		
	}
}

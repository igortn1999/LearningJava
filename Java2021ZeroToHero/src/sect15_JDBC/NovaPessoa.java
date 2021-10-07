package sect15_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException{
		Scanner sc = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConnection();
		
		System.out.println("Informe o nome");
		String nome = sc.nextLine();

		//Exemplo de SQL injection:
		//nome = "X');DROP * FROM PESSOAS WHERE ('1'='1";		
		String sql ="INSERT INTO PESSOAS (nome) VALUES('"+nome+"');";
		//isso server para mostrar que o método com concatenação não é seguro
		
		
		//Para evitar o sql injection, é melhor usar o PrepareStatement :
		sql = "INSERT INTO PESSOAS (nome) VALUES(?);";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		//garantir que não haja uma SQL injection
		stmt.setString(1, nome);//insere 'nome' na primeira interrogação
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		sc.close();
		conexao.close();
	}

}

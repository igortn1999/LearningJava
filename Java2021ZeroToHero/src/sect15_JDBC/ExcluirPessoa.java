package sect15_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException{
		Scanner sc = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConnection();
		String sql = "DELETE FROM PESSOAS WHERE CODIGO = ?";
		
		System.out.println("Informe o codigo da pessoa a ser deletada:");
		int codigo = sc.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa exlcuida com sucesso!");
		}else {
			System.out.println("Não foi possível excluir!");
		}
		
		conexao.close();
		sc.close();
		
	}
	
}

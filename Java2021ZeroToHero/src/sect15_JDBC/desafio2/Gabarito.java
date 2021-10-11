package sect15_JDBC.desafio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import sect15_JDBC.FabricaConexao;
import sect15_JDBC.PessoaSect15;

public class Gabarito {
	
	public static void main(String[] args) throws SQLException{
		
		Connection conexao = FabricaConexao.getConnection();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o codigo da pessoa: ");
		int codigo = sc.nextInt();
		
		String select = "SELECT CODIGO, NOME FROM PESSOAS WHERE CODIGO = ?";
		String update = "UPDATE PESSOAS SET NOME = ? WHERE CODIGO = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()){
			PessoaSect15 p = new PessoaSect15(resultado.getInt(1), resultado.getString(2));
			System.out.println("Nome atual: "+ p.getNome());
			sc.nextLine();
			System.out.println("Informe o novo nome: ");
			String novoNome = sc.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
			
		}else {
			System.out.println("Pessoa não encontrada!");
		}
		
		sc.close();
		conexao.close();
		
	}

}

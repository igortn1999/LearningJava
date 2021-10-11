package sect15_JDBC.desafio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sect15_JDBC.FabricaConexao;
import sect15_JDBC.PessoaSect15;

public class AtualizarRegistro {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner sc = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConnection();
		
		System.out.println("Informe o codigo da pessoa cujo nome será alterado: ");
//		int idIn = sc.nextInt();	
//		String idS = Integer.toString(idIn);
		String idS = sc.nextLine();
		
		System.out.println("Registro atual: ");
		regAtual(conexao, idS);
		
		System.out.println("Digite o novo nome: ");
		String nome = sc.nextLine();
		
		String sql = "UPDATE PESSOAS SET NOME = ? WHERE CODIGO = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "'"+nome+"'");
		stmt.setString(2, idS);
		stmt.execute();
		
		regAtual(conexao, idS);
		
		conexao.close();
		sc.close();
	}
	
	private static void regAtual(Connection conexao, String idS) throws SQLException{
		
		String regAtual = "SELECT * FROM PESSOAS WHERE CODIGO = ?;";
		PreparedStatement stmt = conexao.prepareStatement(regAtual);
		stmt.setString(1, idS);
		ResultSet resultado = stmt.executeQuery();
		
		List<PessoaSect15> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new PessoaSect15(codigo, nome));
		}
		
		for(PessoaSect15 p: pessoas) {
			System.out.println(p.getCodigo() + " --> "+ p.getNome());
		}
		
	}

}

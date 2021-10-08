package sect15_JDBC.desafio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sect15_JDBC.FabricaConexao;
import sect15_JDBC.PessoaSect15;

public class ConsultarPessoas2 {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner sc = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConnection();
		System.out.println("Digite seu nome para ser consultado no DB");
		String nomeUser = sc.nextLine();
		
		String sql = "SELECT * FROM PESSOAS WHERE NOME LIKE ?;";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1,"%" + nomeUser + "%");
		ResultSet resultado = stmt.executeQuery();
		
		List<PessoaSect15> pessoas = new ArrayList<>();
		
		while(resultado.next()){
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			pessoas.add(new PessoaSect15(codigo, nome));
		}
		
		for(PessoaSect15 p: pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
		stmt.close();
		sc.close();
		conexao.close();
		
	}

}

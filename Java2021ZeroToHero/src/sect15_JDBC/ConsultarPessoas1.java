package sect15_JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
	
	public static void main(String[] args) throws SQLException{
		Connection conexao = FabricaConexao.getConnection();
		
		String sql = "SELECT * FROM PESSOAS"; 
		
		Statement stmt = conexao.createStatement();
//		stmt.execute(sql);//esse retorna um valor booleano
		ResultSet resultado = stmt.executeQuery(sql);//retorna um ResultSet
		
		List<PessoaSect15> pessoas = new ArrayList<>();
		
		while(resultado.next()) {//como não se sabe a quantidade de linhas que será retornada, cria-se um while
			//resultado.next() chama o proximo resultado (proxima linha da querry)
			
			int codigo = resultado.getInt("codigo"); // pega o resultado da coluna 'codigo' do DB
			String nome = resultado.getString("nome");// pega o resultado da coluna 'nome' do DB
			
			pessoas.add(new PessoaSect15(codigo, nome));	
		}
		
		for(PessoaSect15 p : pessoas) {
			System.out.println(p.getCodigo() + " ==> "+ p.getNome());
		}
		
		stmt.close();
		conexao.close();
	}

}

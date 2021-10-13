package sect15_JDBC;

public class DAOteste {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO PESSOAS (NOME) VALUES (?)";
		System.out.println(dao.incluir(sql, "Inácio Freire"));
		System.out.println(dao.incluir(sql, "Irineu"));
		System.out.println(dao.incluir(sql, "Ednaldo Pereira"));
		
		dao.close();
		
	}

}

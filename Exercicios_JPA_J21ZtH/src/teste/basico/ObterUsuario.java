package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios_JPA_J21ZtH");
		EntityManager em = emf.createEntityManager();
		
		//para consulta, uma trnsação não é necessária
		
		Usuario usuario = em.find(Usuario.class, 8L);//Achar o usuário que tem o ID 1
												//(id é do tipo long, isso precisa ser especificado)
		System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
		

	}

}

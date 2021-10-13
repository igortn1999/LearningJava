package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-JPA-J21ZtH");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Djalma", "Djalma@lanche.com.br");
		novoUsuario.setId(1L);
		em.persist(novoUsuario);
		
		em.close();
		emf.close();
	}

}

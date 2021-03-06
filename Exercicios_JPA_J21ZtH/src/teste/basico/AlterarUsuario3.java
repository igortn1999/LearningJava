package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios_JPA_J21ZtH");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		
		em.detach(usuario);//Removendo o usuario do estado gerenciado
		//isso significa que só haverá atualização se o comando merge for chamado (L 23)
		usuario.setNome("Leonardo");
		
//		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();


	}

}

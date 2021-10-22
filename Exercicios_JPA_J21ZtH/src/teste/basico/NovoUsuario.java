package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios_JPA_J21ZtH");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("teste", "teste@lanche.com.br");
//		novoUsuario.setId(1L);//Depois de setar o ID como auto-incrementado, esta linha não é necessária
		
		em.getTransaction().begin();//iniciar a transação para validar a persistência
		em.persist(novoUsuario);//a persistência só é efetiva num contexto de transação
		em.getTransaction().commit();//efetivar transação
		
		System.out.println("O ID gerado foi: "+ novoUsuario.getId());
		
		em.close();
		emf.close();
	}

}

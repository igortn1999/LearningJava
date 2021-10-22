package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios_JPA_J21ZtH");
		EntityManager em = emf.createEntityManager();
		
		//JPQL é uma forma de buscar dados muito parecida com SQL, mas em vez de rodar a Querry
		//em tabelas, ela será rodada em cima de objetos
		String jpql = "select u from Usuario u";//equivalente a fazer select u.* from Usuario u;
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		//o .class passa a referencia da classe que contêm informações como atributos, construtores, métodos, anotações
		//O .class é um conjunto de metadados sobre a classe. Esse processo se chama "Reflection"

		query.setMaxResults(5);//limita a quantidade de resultado
		
		List<Usuario> usuarios = query.getResultList();
		
		for(Usuario u : usuarios) {
			System.out.println("\n------------------------\n"
								+"ID: "+ u.getId()
								+"\nNome: " + u.getNome()
								+ "\nE-Mail: "+ u.getEmail()
								);
		}
		//Outra forma 
		List<Usuario> usuarios2 = em.createQuery("select u from Usuario u", Usuario.class)
																					.setMaxResults(5)
																					.getResultList();
		for(Usuario u : usuarios2) {
			System.out.println("\n------------------------\n"
								+"ID: "+ u.getId()
								+"\nNome: " + u.getNome()
								+ "\nE-Mail: "+ u.getEmail()
								);
		}
		
		em.close();
		emf.close();
		
	}

}

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios_JPA_J21ZtH");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Leonardo Alterado");
		usuario.setEmail("leonardo@lanche.com.br");
		
//		em.merge(usuario); //mesmo tirando o merge, o DB é atualizado
		//Isso acontece porque uma consulta está sendo feita (linha 17) dentro de um contexto transacional(l15)
		//Nessa caso, a entidade gerada (usuario) está no estado "Gerenciado", que é quando o JPA está 
		//gerenciando o Objeto, e qualquer mudança que ocorra será sicronizada no DB pelo próprio JPA
		
		//Caso o Objeto não esteja no estado gerenciado, o metodo merge precisa ser explicitado
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

		
	}

}

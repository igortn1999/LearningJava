package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E>{//Data Access Object
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	//bloco estático. Será chamado apenas uma única vez quando a classe for carregada pelo Java
	static {
		//um atributo estático deve ser inicializado ou diretamente na declaração ou em um bloco estático
		//aqui pode ser criada uma lógica de inicialização
		
		//é interessante fazer um try catch aqui, pois se houver um erro na inicialização,
		//esse erro pode repercutir para a aplicação inteira
		try {
			emf = Persistence.createEntityManagerFactory("Exercicios_JPA_J21ZtH");
												//unidade de persistencia é passada como parametro
		}catch(Exception e) {
			//aqui é interessante fazer um log do erro
			//log4j
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe){
		this.classe = classe;
		em = emf.createEntityManager();//incializando o Entity Manager na construção do objeto
	}
	
	public DAO abrirTransacao() {
		em.getTransaction().begin();
		return this;
		//ao retornar a propria classe, você permite que outros métodos da classe sejam
		//chamados a partir do retorno deste método
	}
	
	public DAO fecharTransacao() {
		em.getTransaction().commit();
		return this;
	}
	
	public DAO incluir(E entidade) {
		em.persist(entidade);
		return this;
	}
	
	public DAO incluirAtomico(E entidade) {
		return this.abrirTransacao().incluir(entidade).fecharTransacao();
	}
	
	public E obterPorID(Object id) {
		return em.find(classe, id);
	}
	
	public List<E> obterTodos(){
		return obterTodos(10, 0);
	}
	
	public List<E> obterTodos(int qtde, int deslocamento){
		//qtde  = quantidade de resultados na pesquisa (limit)
		//deslocamento = quantos ele deve pular pra começar a pegar os resultados (offset)
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		String jpql = "select e from " + classe.getName() + " e";
		
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	//Criando um método que faz consulta a partir de named query
	public List<E> consultar(String nomeConsulta, Object... params){
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		
		//o for avança de dois em dois porque se espera receber sempre pares de parametro e valor
		for(int i = 0; i < params.length; i+=2) {
			query.setParameter(params[i].toString(), params[i+1]);
		}
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
		//não fecha o EMF porque ele pode ser usado em outro DAO
	}
}

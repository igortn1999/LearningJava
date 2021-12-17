package br.com.cod3r.exercicioSpringBootJ21ZTH.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.exercicioSpringBootJ21ZTH.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
	//a ideia do repositorio é criar metodos de alto nível que vão abstrair todo acesso aos dados 
	//Essa interface será a responsável por fazer a persistencia no DB
	
	/*Alteração da extenção da interface, de CrudRepository para PagingAndSortingRepository,
	o que permite criar consultas paginadas e/ou organizadas 
	*/
	
	
	//Definindo método para encontrar no DB os registros que contém uma determinada string no nome
	public Iterable<Produto> findByNomeContaining(String parteNome);
	//seguindo a convenção de nome "findBy<ATRIBUTO>Containing", o Spring consegue entender a função desse método
	//Poderia ser também:
	//			findByNomeIsContaining
	//			findByNomeContains
	
	//Funciona também com ignoreCase
	public Iterable<Produto> findByNomeContainingIgnoringCase(String parteNome);
	
	//essas convenções de nomes de método pre-estabelecidos podem ser encontradas na documentação do SprongBoot
	//Algumas outras consultas que podem ser interessantes:
	
	//findByNomeStartsWith
	//findByNomeEndsWith
	
	//findByNomeNotContaining
	
	/*Isso tudo é possível modificando apenas esta interface porque o framework to SpringBoot foi criado
	para que não seja necessário criar todo o esquema por trás desses métodos, basta só utilizar as ferramentas
	que já estão disponiveis.
	*/
	
}

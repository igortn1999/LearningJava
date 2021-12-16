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

}

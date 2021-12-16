package br.com.cod3r.exercicioSpringBootJ21ZTH.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.cod3r.exercicioSpringBootJ21ZTH.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	//a ideia do repositorio é criar metodos de alto nível que vão abstrair todo acesso aos dados 
	//Essa interface será a responsável por fazer a persistencia no DB

}

package br.com.cod3r.exercicioSpringBootJ21ZTH.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exercicioSpringBootJ21ZTH.model.entities.Produto;
import br.com.cod3r.exercicioSpringBootJ21ZTH.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	//Injeção de dependência 
	@Autowired
	//Essa anotação indica pro Spring que um objeto do tipo ProdutoRepository precisa ser criado em memoria
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public @ResponseBody Produto novoProduto(@RequestParam String nome) {
		//@ResponseBody indica que o Produto faz parte do corpo da resposta 
		Produto produto = new Produto(nome);
		produtoRepository.save(produto);
		return produto;
	}
	
	

}

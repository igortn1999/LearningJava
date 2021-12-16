package br.com.cod3r.exercicioSpringBootJ21ZTH.controllers;

import javax.validation.Valid;

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
	/*Isso é muito útil quando uma instância de uma outra classe é necessária, e talvez essa classe seja um
	pouco mais complexa para ser criada. 
	Então, em vez de fazer a instância dessa outra classe aqui na forma "Classe classe = new Classe();", basta de-
	clarar como "Classe classe;" e marcar com a anotação @Autowired, que a instaância do tipo classe será entregue
	para a classe que está chamando. Quem se responsabiliza por esse processo é o framework responsável pela injeção
	de dependência. No caso, o Spring. 
	*/
	
	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		//@ResponseBody indica que o Produto faz parte do corpo da resposta
		//@Valid indica que o produto tem que atender às validações definidas dentro dele
		produtoRepository.save(produto);
		return produto;
		/*ao invés de passar cada atributo do como parametro para o método, o Java Spring é esperto o suficiente
		para usar o produto em si e utilizar os parametros do request para criar a instancia desse produto
		*/
	}
}

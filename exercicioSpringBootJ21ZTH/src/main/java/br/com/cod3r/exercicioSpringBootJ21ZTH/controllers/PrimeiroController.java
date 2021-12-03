package br.com.cod3r.exercicioSpringBootJ21ZTH.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controllers são parte do padrão MVC - Model View Controller, que será abordado 
//posteriormente

@RestController // indica que esta classe é um Rest Controller
public class PrimeiroController {

	// criando o primeiro web service
	// enquanto a aplicação estiver rodando, ele atualiza automaticamente a página

//	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	// @RequestMapping = @RequestMapping(method = RequestMethod.GET)
	// Request mapping indica que uma requisição será mapeada para este método
	// Por padrão, a url http://localhost:8080 foi mapeada
	// O método padrão é o metodo (http) GET
	// path especifica o caminho em que se encontra a requisição, para que ela não
	// fique na raiz
	// portanto a requisição do método ola() será feita em http://localhost:8080/ola

	@GetMapping(path = { "/ola", "/saudacao" })
	// Outra opção para mapeamento de metodo GET é a notação @GetMapping
	// Que já é especifica para métodos tipo get
	// é possivel disponibilizar o mesmo metodo em varias URLs fazendo um array
	public String ola() {
		return "Olá, Spring Boot!";
		// este método simples foi criado, e agora a execução desse método pre-
		// cisa ser mapeada para alguma URL dentro da aplicação.
		// Isso é feito através das Anotations
	}

}

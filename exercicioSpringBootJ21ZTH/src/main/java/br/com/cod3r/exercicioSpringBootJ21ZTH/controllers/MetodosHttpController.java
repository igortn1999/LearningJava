package br.com.cod3r.exercicioSpringBootJ21ZTH.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {
	
	//Para testar requisições HTTP, pode-se usar a ferramenta Postman, ou Insomnia que é open source e gratuita
	
	@GetMapping
	public String get() {
		return "Requisição GET";
	}
	
	@PostMapping
	public String post() {//Ao criar o "formulario.html", é possível servir essa pagina dentro da aplicação
		return "Requisição POST";//para acessar o formulario, basta acessar localhost:8080/formulario.htmll
	}
	
	@PutMapping
	public String put() {
		return "Requisição PUT";
	}
	
	@PatchMapping
	public String patch() {
		return "Requisição PATCH";
	}
	
	@DeleteMapping
	public String delete() {
		return "Requisição DELETE";
	}

}

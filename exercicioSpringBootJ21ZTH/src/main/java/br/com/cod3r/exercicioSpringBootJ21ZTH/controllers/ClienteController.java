package br.com.cod3r.exercicioSpringBootJ21ZTH.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exercicioSpringBootJ21ZTH.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")//indicando que toda essa classe está mapeada
//para a url /clientes
public class ClienteController {
	
	//@GetMapping(path = "/clientes/qualquer")
	@GetMapping(path = "/qualquer")
	//Como a classe já está mapeada para /clientes, a url para este método ficará
	//disponível a partir da url da classe, ou seja: /clientes/qualquer
	public Cliente obterCliente() {
		return new Cliente(18, "Pedro", "123.456.789-00");
		//Ao retornar um objeto, o Spring Boot automaticamente converte para 
		//o formato JSON
	}

}

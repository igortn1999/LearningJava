package br.com.cod3r.exercicioSpringBootJ21ZTH.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exercicioSpringBootJ21ZTH.model.entities.Cliente;

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
	
	//queremos acessar determinado cliente informando seu id na URL:
	@GetMapping("/{id}")//especificar que o id informado na url será o id do cliente que estamos procurando 
	public Cliente obterClientePorId1(@PathVariable int id) {//Essa Anotation indica q esse paremetro sera usada no path
		return new Cliente(id, "Maria", "987.654.321-00");
		//essa forma funciona mas não é o jeito padrão de passar parametro a partir de requisição GET HTTP
	}
	
	//query string é a forma padrão e mais utilizada pelo protocolo HTTP
	//com esse método a url não muda para "/clientes";
	//ela continuará sendo /clientes e para procurar o id, basta adicionar "?id"
	//Ex: para chamar o cliente de ID 12, a url seria /clientes?12
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id){
		//RequestParam identifica que a "chave será usada como parametro da request (padrão com "?")
		//name especifica o nome do parametro que será usado, então sempre que chegar uma variável com o nome "id"
		//isso será direcionado como parametro de request.
		//caso nenhum parametro seja especificado,será usado o que está definido no defaultValue
		return new Cliente(id, "João Augusto", "111.222.333-44");
	}

}

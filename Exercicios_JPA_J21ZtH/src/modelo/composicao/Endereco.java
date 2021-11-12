package modelo.composicao;

import javax.persistence.Embeddable;

//aula embeddable
@Embeddable
public class Endereco {
	//Supõe-se que tanto Forncedores quanto Funcionários têm um dendereço
	//Só que não há uma tabela de endereços, essas informações são colocadas diretamente nas respectivas
	//tabelas de fornecedores e funcionários 
	//para isso, usa-se a notação Embeddable
	//Embeddable indica que este objeto será colocado dentro das tabelas que o chamarem
	
	

	private String logradouro;
	private String complemento;
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
}

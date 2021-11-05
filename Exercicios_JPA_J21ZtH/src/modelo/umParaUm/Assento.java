package modelo.umParaUm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assentos")
public class Assento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	@OneToOne(mappedBy = "assento")
	//mappedBy informa que quem realmente mapeia essa relação é o atributo assento do Cliente
	//se não usar mappedBy, um atributo será criado dentro de Assento, chamado Cliente_id o que criará uma coluna no DB
	//Isso não pode ocorrer pois não existe relação bidrecional em Banco de Dados, pois pode gerar inconsistencia de dados
	//O atributo mappedBy expecifica que a relação bidirecional já foi definida em outro atributo
	private Cliente cliente;//Criando relação bidirecional
	
	
	public Assento() {
		
	}
	
	public Assento(String nome){
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}

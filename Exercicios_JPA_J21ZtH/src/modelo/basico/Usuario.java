package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Anotação @Entity (javax.persistence). Especifica que 
//esta classe está mapeada para uma tabela no banco de dados.
//A convenção é que o nome da tabela no DB vai ser exatamente
//o mesmo nome da classe
@Entity
public class Usuario {
	
	@Id //especifica que o atributo id será a PK 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que esta PK é auto-incrementada, a estrategia evidencia que esta coluna será usada com identidade
	private long id;
	//por padrão, qualquer atributo que pertence a uma classe será mapeado para uma coluna
	private String nome;
	private String email;
	//Se houver algum atributo que não deve ir para o DB, usar a anotação @Transient
	
	public Usuario() {
		this(null, null);
	}
	
	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

}

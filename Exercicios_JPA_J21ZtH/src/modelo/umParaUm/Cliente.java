package modelo.umParaUm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	@OneToOne//identifica que haverá uma relação de um para um entre as duas classes
	private Assento assento;//foi definido que é mais interessante obter o assento através do cliente do que o contrário
	//por isso Cliente abriga o Objeto do seu assento (a tabela do cliente terá uma coluna de FK para o assento)
	//essa coluna é gerada automaticamente por causa da notação @OneToOne
	
	public Cliente(){
		
	}
	
	public Cliente(String nome, Assento assento){
		this.nome = nome;
		this.assento = assento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}

package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Produtos", schema = "curso_java")
//desta forma é possivel alterar o nome da tabela que sera criada no DB para esta classe
public class Produto {
	//é preciso declarar no persistence.xml que esta classe existe
	//apenas por estar explicitado no persistence.xml (que está setado para fazer update)
	//e conter as anotações de Entity e ID,
	//o JPA criará automaticamente uma tabela com o nome da classe, caso uma não exista  
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//explicita que haverá um valor unico para cada produto
	private Long id;
	@Column(name = "Produto", length = 200, nullable = false)//especificando detalhes da coluna
	//Vale lembrar que essas notations servem para quando o JPA é o gerador da tabela.
	//Se a tabela já exsite no DB, vale o que já estava configurado.
	private String nome;
	@Column(name = "Valor", nullable = false, precision = 11, scale = 2)
	//precision = tamanho (total de casas que o numero vai ocupar)
	//scale = quantidade de numeros após o ponto flutuante
	private Double preco;//pode usar tanto o primitivo quando o objeto
	
	public Produto() {
		
	}
	
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
		
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	

}

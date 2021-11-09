package modelo.muitosParaMuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private double nota;
	
	@ManyToMany(cascade = CascadeType.PERSIST)//garante que a persistencia será repercutida para os atores a partir do filme
	@JoinTable(//notação que indica a junção das duas tabelas
			name = "atores_filmes", //nome da tabela de junção configurado
			//a coluna que referencia a coluna "id" da tabela Filmes na tabela intermediária será chamada filme_id
			joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"), 
			//a coluna que referencia a coluna "id" da tabela Atores na tabela intermediária será chamada ator_id
			inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id") 
			)//duas PKs sendo usadas como FK em uma tabela itermediária "atores_filmes
	//joinColumn referencia essa Classe
	//inverseJoinColumn referencia a Classe Atores
	private List<Ator> atores;
	
	public Filme() {
		
	}
	
	public Filme(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
		
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

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public List<Ator> getAtores() {
		if(atores == null) {
			atores = new ArrayList<>();
		}
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	
	//metodo para facilitar resgistro de atores e filmes de forma bidirecional
	public void adicionarAtor(Ator ator) {
		if(ator !=null && !getAtores().contains(ator)){
			getAtores().add(ator);
			
			if(!ator.getFilmes().contains(this)) {
				ator.getFilmes().add(this);				
			}
		}
	}
	
	
}

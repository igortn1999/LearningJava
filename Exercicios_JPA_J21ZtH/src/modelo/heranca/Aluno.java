package modelo.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

//notação de herança Inheritance possui 3 estratégias
//Se não usar essa anotação, será criada apena uma tabela, resultando no mesmo que usar a estrategia Single Table
//Ela é usada na classe PAI

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)//cria uma tabela para cada classe

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//Essa notação precisa de um discriminador
//@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)//representa o tipo de instancia no DB,
////Serve para que o JPA Saiba qual classe precisa ser instanciada (Ex Aluno ou AlunoBolsista)
//@DiscriminatorValue("AL")//Aluno normal terá "AL" marcado na coluna "tipo" no DB

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL")
//No caso do JOINED, duas tabelas serão criadas, mas a tabela de aluno só contém
//informações que dizem respeito ao que é comum a todos os alunos
//Na tabela de Aluno Bolsista, a matricula é passada como FK e os dados sobre a bolsa,
//que é uma característica específica de aluno bolsista, são armazenados nessa tabela 
//O Discriminador identifica a necessidade do aluno ser ou não inserido nessa tabela de aluno bolsista
//Essa é geralmente a melhor das estratégia

public class Aluno {
	
	@Id
	private Long matricula;
	
	private String nome;
	
	public Aluno(Long matricula, String nome){
		super();
		this.matricula = matricula;
		this.nome= nome;
	}
	
	public Aluno(){
		
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}

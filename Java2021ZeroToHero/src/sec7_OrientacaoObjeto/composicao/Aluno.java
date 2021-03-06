package sec7_OrientacaoObjeto.composicao;

import java.util.ArrayList;
import java.util.List;


public class Aluno {
	
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	//Uma Lista constante que dizer que o endereço de memoria 
   //em que ele se encontra é constante (não pode fazer isso:
  //this.cursos = new ArrayList<Curso>();)
 //Não significa que o que tem dentro da lista é constante.
	
	Aluno(String nome){
		this.nome=nome;
	}
	
	void adicionarCursos(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		
		for(Curso curso : this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
		
	}
	
	public String toString() {
		return nome;
		
	}

}

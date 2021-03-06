package sec7_OrientacaoObjeto.composicao;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Jão");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Pedro");
		
		Curso c1 = new Curso("Java Completo");
		Curso c2 = new Curso("Web 2023");
		Curso c3 = new Curso("React Native");
		
		c1.adicionaraluno(a1);
		c1.adicionaraluno(a2);
	
		c2.adicionaraluno(a1);
		c2.adicionaraluno(a3);
		
		a1.adicionarCursos(c3);
		a2.adicionarCursos(c3);
		a3.adicionarCursos(c3);
		
		for(Aluno aluno : c1.alunos) {
			System.out.println(aluno.nome);
		}
		System.out.println();
		
		for(Aluno aluno : c2.alunos) {
			System.out.println(aluno.nome);
		}
		System.out.println();
		
		for(Aluno aluno : c3.alunos) {
			System.out.println(aluno.nome);
		}
		System.out.println();
	
		Curso cursoEncontrado = a1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado!=null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	
	}
}

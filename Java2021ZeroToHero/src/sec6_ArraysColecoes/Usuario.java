package sec6_ArraysColecoes;

public class Usuario {
	
	String nome;
	String email;
	
	Usuario(){
		this("Default", "default@domain.com");
	}
	
	Usuario(String nome, String email){
		this.nome=nome;
		this.email=email;
		
	}
	
	@Override
	public boolean equals(Object objeto) {//Object é a classe da qual todos os objetos herdam
	
		Usuario outro = (Usuario) objeto;
		
		if(objeto instanceof Usuario) {//assegurar que o Objeto realmente é uma instancia de Usuario
			boolean nomeIgual = outro.nome == this.nome;
			boolean emailIgual = outro.email == this.email;
			
			return nomeIgual && emailIgual;			
		}
		
		return false;
	}

}

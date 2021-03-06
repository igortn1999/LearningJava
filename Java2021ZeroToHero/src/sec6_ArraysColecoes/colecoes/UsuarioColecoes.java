package sec6_ArraysColecoes.colecoes;

public class UsuarioColecoes {
	
	String nome;
	UsuarioColecoes(){
		this("Default");
	}
	
	UsuarioColecoes(String nome){
		this.nome=nome;
		
	}
	
	@Override
	public String toString() {
		return String.format("Olá, meu nome é %s.", this.nome);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioColecoes other = (UsuarioColecoes) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
}

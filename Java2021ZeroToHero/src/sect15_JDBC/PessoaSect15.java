package sect15_JDBC;

public class PessoaSect15 {

	public PessoaSect15(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	private int codigo;
	private String nome;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

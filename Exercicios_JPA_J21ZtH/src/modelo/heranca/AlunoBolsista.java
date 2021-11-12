package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")//necessário para a estratégia SingleTable possa diferenciar no DB os dois tipos de aluno
public class AlunoBolsista extends Aluno{
	//Não precisa de @Id porque a classe pai já tem
	
	private double valorBolsa;
	
	public AlunoBolsista() {
		
	}

	public AlunoBolsista(Long matricula, String nome, double valorBolsa) {
		super(matricula, nome);
		this.valorBolsa = valorBolsa;
	}

	public double getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
	
	

}

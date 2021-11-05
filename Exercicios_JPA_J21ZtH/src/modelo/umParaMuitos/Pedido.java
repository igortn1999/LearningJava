package modelo.umParaMuitos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date data;
	
	@OneToMany(mappedBy = "pedido")//one to many informa que cada item nessa lista está relacionado a este Pedido
	//mapped by informa qual é a coluna que representa a relação entre os itens e o pedido
	//o atributo mappadBy está sempre do lado da relação que não contém a FK em uma das colunas de sua tabela
	private List<ItemPedido> itens;

	public Pedido() {
		this(new Date());//pega a data atual
		
	}
	
	public Pedido(Date data) {
		super();
		this.data = data;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
}
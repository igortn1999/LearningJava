package modelo.umParaMuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import modelo.basico.Produto;

@Entity
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne //indica que há muitos ItemPedido para um Pedido
	private Pedido pedido;
	
	@ManyToOne(fetch = FetchType.EAGER) //esse é o valor default (...ToOne -> EAGER)
	private Produto produto;
	
	@Column(nullable = false)
	private int quantidade;
	
	@Column(nullable = false)
	private Double preco;//item do pedido tem um preço pois o preço do produto pode variar com o tempo,
	//este atributo registra o preço do Item no momento da compra

	public ItemPedido() {
		
	}
	
	public ItemPedido(Pedido pedido, Produto produto, int quantidade){
		super();
		this.setPedido(pedido);
		this.setProduto(produto);
		this.setQuantidade(quantidade);
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
		if(produto != null && this.preco == null){
			this.setPreco(produto.getPreco());
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	

}

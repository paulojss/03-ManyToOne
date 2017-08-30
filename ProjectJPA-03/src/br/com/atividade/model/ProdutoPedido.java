package br.com.atividade.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="produto_pedido")
@SequenceGenerator(name="produto_pedido_seq", sequenceName="produto_pedido_seq",
		initialValue = 1, allocationSize = 1)
public class ProdutoPedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator = "produto_pedido_seq")
	private long id;
	private int qtde;
	
	@ManyToOne
	private Pedido pedidos;
	
	@ManyToOne
	private Produto produtos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Pedido getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}

	
	
}

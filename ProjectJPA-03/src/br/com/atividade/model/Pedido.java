package br.com.atividade.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
@SequenceGenerator(name="pedido_seq", sequenceName="pedido_seq",
		initialValue = 1, allocationSize = 1)
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
			generator = "pedido_seq")
	private long numero;
	private Date data;
	
	@ManyToOne
	private Cliente cliente;
	@OneToMany(mappedBy = "pedidos")
	private List<ProdutoPedido> produtosPedidos;
	
	//Getters and Setters
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}

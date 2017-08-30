package br.com.atividade.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="produto")
@SequenceGenerator(name="produto_seq", sequenceName="produto_seq",
		initialValue = 1, allocationSize = 1)
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
			generator = "produto_seq")
	@Column(name = "produto_id")
	private long id;
	private String nome;
	private String descricao;
	private double valor;
	
	@OneToMany(mappedBy = "produtos")
	private List<ProdutoPedido> produtosPedidos;
	@OneToMany(mappedBy = "produtos")
	private List<FornecedorProduto> fornecedoresProdutos;
	
	//Getters and Setters
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<ProdutoPedido> getProdutosPedidos() {
		return produtosPedidos;
	}

	public void setProdutosPedidos(List<ProdutoPedido> produtosPedidos) {
		this.produtosPedidos = produtosPedidos;
	}

	public List<FornecedorProduto> getFornecedoresProdutos() {
		return fornecedoresProdutos;
	}

	public void setFornecedoresProdutos(List<FornecedorProduto> fornecedoresProdutos) {
		this.fornecedoresProdutos = fornecedoresProdutos;
	}

	
}

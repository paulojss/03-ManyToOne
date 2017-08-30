package br.com.atividade.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="fornecedor_produto")
@SequenceGenerator(name="fornecedor_produto_seq", sequenceName="fornecedor_produto_seq",
		initialValue = 1, allocationSize = 1)
public class FornecedorProduto {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
			generator="fornecedor_produto_seq")
	private long id;
	
	@Temporal(TemporalType.DATE)
	private Calendar data;
	
	@ManyToOne
	private Produto produtos;
	@ManyToOne
	private Fornecedor fornecedores;
	
	
	//Getters and Setters
	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}

	public Fornecedor getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Fornecedor fornecedores) {
		this.fornecedores = fornecedores;
	}

	
}

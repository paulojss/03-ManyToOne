package br.com.atividade.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="fornecedor")
@SequenceGenerator(name="fornecedor_seq", sequenceName="fornecedor_seq",
		initialValue = 1, allocationSize = 1)
public class Fornecedor {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
			generator = "fornecedor_seq")
	private long codigo;
	private String nome;
	private long cnpj;
	
	@OneToMany(mappedBy = "fornecedores")
	private List<FornecedorProduto> fornecedoresProdutos;
	
	//Getters and Setters
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public List<FornecedorProduto> getFornecedoresProdutos() {
		return fornecedoresProdutos;
	}
	public void setFornecedoresProdutos(List<FornecedorProduto> fornecedoresProdutos) {
		this.fornecedoresProdutos = fornecedoresProdutos;
	}
	
}

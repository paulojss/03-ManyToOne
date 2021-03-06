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
@Table(name="cliente")
@SequenceGenerator(name="cliente_seq", sequenceName="cliente_seq",
		initialValue = 1, allocationSize = 1)
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
			generator="cliente_seq")
	private long cpf;
	private String nome;
	private String endereco;
	private long telefone;
	private String email;
	
	@OneToMany(mappedBy="cliente")
	private List<Pedido> pedido;
	
	//Getters and Setters
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
	
	

}

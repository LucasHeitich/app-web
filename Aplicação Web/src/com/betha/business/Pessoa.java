package com.betha.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Pessoa {
	
	private Integer codigo;
	private String nome;
	private String telefone;
	private String endereco;
	
	public Pessoa(){
		
	}
	public Pessoa(Integer codigo, String nome, String telefone, String endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}
	public Pessoa(String nome, String telefone, String endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco=endereco;
	}
	
	public Pessoa( String nome, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Id
	@GeneratedValue
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}

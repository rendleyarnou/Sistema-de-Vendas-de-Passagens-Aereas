package com.aerotickets.fbd.entity;

public class Passageiro {
	
	private Integer pid;
	
	private String nome;
	
	private int idade;
	
	private String cpf;
	
	private String email;

	public Passageiro() {};

	public Passageiro( String nome, int idade, String cpf, String email) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.email = email;
	}

	public Integer getPid() {
		return pid;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

package br.com.aerotickets.entidade;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * @author braullio-soares
 * Classe de entidade que possui atributos do passageiro 
 */
public class Passageiro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String nome;

	private String sexo;
	
	private String email;
	
	private String tel;
	
	private Date dataNasc;
	
	public Passageiro() {}
	
	public Passageiro(Long id, String nome, String sexo, String email, String tel, Date dataNasc) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.tel = tel;
		this.dataNasc = dataNasc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Passageiro [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", email=" + email + ", tel=" + tel
				+ ", dataNasc=" + dataNasc + "]";
	}
	
}

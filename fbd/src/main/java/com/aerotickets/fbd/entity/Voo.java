package com.aerotickets.fbd.entity;

import java.sql.Date;
import java.sql.Time;

public class Voo {
	
	private int id;
	
	private String origem;
	
	private String destino;
	
	private Date datavoo;
	
	private Time horario;
	
	private double preco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}


	public Date getDatavoo() {
		return datavoo;
	}

	public void setDatavoo(Date datavoo) {
		this.datavoo = datavoo;
	}

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}

package com.aerotickets.fbd.entity;

public class Reserva {
	
	private Long  idReserva;
	
	private double valor;
	
	private Long idPassageiro;
	
	private Long idVoo;
	
	private int assento;

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Long getIdPassageiro() {
		return idPassageiro;
	}

	public void setIdPassageiro(Long idPassageiro) {
		this.idPassageiro = idPassageiro;
	}

	public Long getIdVoo() {
		return idVoo;
	}

	public void setIdVoo(Long idVoo) {
		this.idVoo = idVoo;
	}

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}

}

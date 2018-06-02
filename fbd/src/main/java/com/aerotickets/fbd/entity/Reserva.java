package com.aerotickets.fbd.entity;

public class Reserva {

	private int rid;

	private int pid;

	private int vid;

	private int assento;

	public Reserva() {}

	public Reserva(int vid, int pid, int assento) {
		this.pid = pid;
		this.vid = vid;
		this.assento = assento;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}
}

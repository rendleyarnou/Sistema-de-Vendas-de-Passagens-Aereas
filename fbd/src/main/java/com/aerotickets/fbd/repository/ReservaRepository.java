package com.aerotickets.fbd.repository;

import java.util.List;

import com.aerotickets.fbd.entity.Reserva;

public interface ReservaRepository {
	
	List<Reserva> getAllReservas();
	
	Reserva getReservaById(int r);
	
	void addReserva(Reserva r);
	
	void deleteReserva(int id);
	
	void updateReserva(Reserva r);
}

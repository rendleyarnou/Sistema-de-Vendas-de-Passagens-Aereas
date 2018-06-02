package com.aerotickets.fbd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerotickets.fbd.entity.Reserva;
import com.aerotickets.fbd.repository.ReservaRepository;

@Service
public class ReservaService implements ReservaRepository {
	
	@Autowired
	private ReservaRepository represerva;

	@Override
	public List<Reserva> getAllReservas() {
		return represerva.getAllReservas();
	}

	@Override
	public Reserva getReservaById(int r) {
		
		return represerva.getReservaById(r);
	}

	@Override
	public void addReserva(Reserva r) {
		represerva.addReserva(r);
		
	}

	@Override
	public void deleteReserva(int id) {
		represerva.deleteReserva(id);
		
	}

	@Override
	public void updateReserva(Reserva r) {
		represerva.updateReserva(r);
		
	}

}

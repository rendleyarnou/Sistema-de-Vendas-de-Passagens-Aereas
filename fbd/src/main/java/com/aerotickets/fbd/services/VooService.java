package com.aerotickets.fbd.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerotickets.fbd.entity.Voo;
import com.aerotickets.fbd.repository.VooRepository;

@Service
public class VooService implements VooRepository {
	
	@Autowired
	private VooRepository vooRepo;

	@Override
	public List<Voo> getAllVoos() {
		return vooRepo.getAllVoos();
	}

	@Override
	public Voo getVooById(int idVoo) {
		Voo obj = vooRepo.getVooById(idVoo);
		return obj;
	}

	@Override
	public List<Voo> getAllVoos(Date date) {
		return vooRepo.getAllVoos(date);
	}

}

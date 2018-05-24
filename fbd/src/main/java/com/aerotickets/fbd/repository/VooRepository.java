package com.aerotickets.fbd.repository;

import java.util.List;

import com.aerotickets.fbd.entity.Voo;

public interface VooRepository {
	
	List<Voo> getAllVoos();
	
	Voo getVooById(int idVoo);

}

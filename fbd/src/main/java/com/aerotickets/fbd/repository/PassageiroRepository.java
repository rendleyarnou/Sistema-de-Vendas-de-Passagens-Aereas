package com.aerotickets.fbd.repository;

import java.util.List;

import com.aerotickets.fbd.entity.Passageiro;

public interface PassageiroRepository {
	
	List<Passageiro> getAllPassageiros();
	
	Passageiro getPassageiroById(int pid);
	
	void addPassageiro(Passageiro p);
	
	void updatePassageiro(Passageiro p);
	
	void deletePassageiro(int pid);
	
	int getPid(Passageiro p);
}

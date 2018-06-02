package com.aerotickets.fbd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerotickets.fbd.entity.Passageiro;
import com.aerotickets.fbd.repository.PassageiroRepository;

@Service
public class PassageiroService implements PassageiroRepository {
	
	@Autowired
	private PassageiroRepository passagRepo;

	@Override
	public List<Passageiro> getAllPassageiros() {
		return passagRepo.getAllPassageiros();
	}

	@Override
	public Passageiro getPassageiroById(int pid) {
		Passageiro p = passagRepo.getPassageiroById(pid);
		return p;
	}

	@Override
	public void addPassageiro(Passageiro p) {
		passagRepo.addPassageiro(p);
		
	}

	@Override
	public void updatePassageiro(Passageiro p) {
		passagRepo.updatePassageiro(p);
	}

	@Override
	public void deletePassageiro(int pid) {
		passagRepo.deletePassageiro(pid);
		
	}
	
	@Override
	public int getPid(Passageiro p) {
		return passagRepo.getPid(p);
	}

}

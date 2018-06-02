package com.aerotickets.fbd.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.aerotickets.fbd.entity.Passageiro;
import com.aerotickets.fbd.repository.PassageiroRepository;

@Repository
public class PassageiroDAO implements PassageiroRepository{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public List<Passageiro> getAllPassageiros() {
		String sql = "SELECT * FROM passageiro";
		RowMapper<Passageiro> rowMapper = new BeanPropertyRowMapper<Passageiro>(Passageiro.class);
		
		return this.jdbc.query(sql, rowMapper);
	}

	@Override
	public Passageiro getPassageiroById(int pid) {
		String sql = "SELECT * FROM passageiro where pid = ?";
		RowMapper<Passageiro> rowMapper = new BeanPropertyRowMapper<Passageiro>(Passageiro.class);
		
		Passageiro passageiro = jdbc.queryForObject(sql, rowMapper, pid); 
		
		return passageiro;   
	}

	@Override
	public void updatePassageiro(Passageiro p) {
		String sql = "UPDATE passageiro SET nome=?, idade=?, cpf=?, email=? WHERE pid = ?";
		jdbc.update(sql, p.getNome(), p.getIdade(), p.getCpf(), p.getEmail(), p.getPid());		
	}

	@Override
	public void deletePassageiro(int pid) {
		String sql = "delete from passageiro where pid = ?";
		jdbc.update(sql, pid);
	}

	@Override
	public void addPassageiro(Passageiro p) {
		String sql = "insert into passageiro (nome, idade, cpf, email) values (?, ?, ?, ?)";
		jdbc.update(sql, p.getNome(), p.getIdade(), p.getCpf(), p.getEmail());
	}
	
	public int getPid(Passageiro p) {
		String sql = "SELECT * FROM passageiro where cpf = ?";
		RowMapper<Passageiro> rowMapper = new BeanPropertyRowMapper<Passageiro>(Passageiro.class);
		
		Passageiro passageiro = jdbc.queryForObject(sql, rowMapper, p.getCpf()); 
		
		return passageiro.getPid();
	}

}

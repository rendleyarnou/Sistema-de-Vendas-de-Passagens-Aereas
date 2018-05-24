package com.aerotickets.fbd.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.aerotickets.fbd.entity.Voo;
import com.aerotickets.fbd.repository.VooRepository;

@Repository
public class VooDAO implements VooRepository {
	
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Voo> getAllVoos() {
		String sql = "SELECT id, origem, destino, datavoo, horario, preco FROM voo";
		RowMapper<Voo> rowMapper = new BeanPropertyRowMapper<Voo>(Voo.class);
		return this.jdbc.query(sql, rowMapper);
	}

	@Override
	public Voo getVooById(int idVoo) {
		String sql = "SELECT * FROM voo WHERE id = ?";
		
		RowMapper<Voo> rowMapper = new BeanPropertyRowMapper<Voo>(Voo.class);
		Voo voo = jdbc.queryForObject(sql, rowMapper, idVoo);
		
		return voo;
	}

}

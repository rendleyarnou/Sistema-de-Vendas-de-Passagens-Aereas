package com.aerotickets.fbd.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.aerotickets.fbd.entity.Reserva;
import com.aerotickets.fbd.repository.ReservaRepository;

@Repository
public class ReservaDAO implements ReservaRepository{
	
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Reserva> getAllReservas() {
		String sql = "SELECT * FROM reserva";
		RowMapper<Reserva> rowMapper = new BeanPropertyRowMapper<Reserva>(Reserva.class);
		
		return this.jdbc.query(sql, rowMapper);
	}

	@Override
	public Reserva getReservaById(int rid) {
		String sql = "SELECT * FROM reserva where rid = ?";
		RowMapper<Reserva> rowMapper = new BeanPropertyRowMapper<Reserva>(Reserva.class);
		
		Reserva reserva = jdbc.queryForObject(sql, rowMapper, rid); 
		
		return reserva;   
	}

	@Override
	public void addReserva(Reserva r) {
		String sql = "insert into reserva (vid, pid, assento) values (?, ?, ?)";
		jdbc.update(sql, r.getVid(), r.getPid(), r.getAssento());
	}

	@Override
	public void deleteReserva(int rid) {
		String sql = "delete from reserva where rid = ?";
		jdbc.update(sql, rid);
	}

	@Override
	public void updateReserva(Reserva r) {
		String sql = "UPDATE reserva SET vid=?, pid=?, assento=? WHERE rid = ?";
		jdbc.update(sql, r.getVid(), r.getPid(), r.getAssento(), r.getRid());
		
	}
	

}

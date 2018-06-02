package com.aerotickets.fbd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aerotickets.fbd.entity.Passageiro;
import com.aerotickets.fbd.entity.Reserva;
import com.aerotickets.fbd.services.PassageiroService;
import com.aerotickets.fbd.services.ReservaService;

@Controller
public class ReservaController {
	
	@Autowired
	private PassageiroService pservice;
	
	@Autowired
	private ReservaService rservice;
	
	@RequestMapping(value="/reservar", method = RequestMethod.POST)
	public String cadastrar(
			@RequestParam int id,
			@RequestParam String nome,
			@RequestParam int idade,
			@RequestParam String cpf,
			@RequestParam String email,
			@RequestParam int assento) {
		
		Passageiro p = new Passageiro(nome, idade, cpf, email);
		pservice.addPassageiro(p);
		
		Reserva r = new Reserva(id, pservice.getPid(p), assento);
		rservice.addReserva(r);
				
		return "redirect:/reservas";
	}
	
	@RequestMapping("/reservas")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("pages/reservas");
		
		mv.addObject("reservas", rservice.getAllReservas());
		
		return mv;
	}
	@RequestMapping("/delete-reserva/{id}")
	public String deleteRerserva(@PathVariable int id) {
		
		rservice.deleteReserva(id);
		return "redirect:/reservas";
	}
	
}

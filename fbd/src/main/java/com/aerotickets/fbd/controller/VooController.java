package com.aerotickets.fbd.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aerotickets.fbd.services.VooService;

@Controller
public class VooController {

	@Autowired
	private VooService service;
	
	@RequestMapping("/voos")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("pages/listar-voos");
		
		mv.addObject("voos", service.getAllVoos());
		
		return mv;
	}
	
	@RequestMapping("/pesquisa-voos")
	public ModelAndView listar(@RequestParam("date") Date date) {
		ModelAndView mv = new ModelAndView("pages/listar-voos");
		
		mv.addObject("voos", service.getAllVoos(date));
		
		return mv;
	}

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/cadastro/{id}")
	public ModelAndView cadastro(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("pages/cadastro-passageiro");
		
		mv.addObject("voo", service.getVooById(id));
		
		return mv;
	}
}

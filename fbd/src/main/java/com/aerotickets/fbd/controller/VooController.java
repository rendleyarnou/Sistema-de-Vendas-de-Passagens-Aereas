package com.aerotickets.fbd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aerotickets.fbd.services.VooService;

@Controller
public class VooController {

	@Autowired
	private VooService service;
	
	@RequestMapping("/voos")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("pages/listarVoos");
		
		mv.addObject("voos", service.getAllVoos());
		
		return mv;
	}

	@RequestMapping("/resumo")
	public ModelAndView descVoo() {
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("voo", service.getVooById(1));
		
		return mv;
	}
}

package com.aerotickets.fbd.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aerotickets.fbd.entity.Passageiro;
import com.aerotickets.fbd.services.PassageiroService;

@Controller
public class PassageiroController {
	
	@Autowired
	private PassageiroService pservice;
	
	@RequestMapping("/passageiros")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("pages/listar-passageiros");
		
		mv.addObject("passageiros", pservice.getAllPassageiros());
		
		return mv;
	}
	
	@RequestMapping(value="/add-pass", method = RequestMethod.POST)
	public String cadastrar(
			@RequestParam String nome,
			@RequestParam int idade,
			@RequestParam String cpf,
			@RequestParam String email) {
		
		Passageiro p = new Passageiro(nome, idade, cpf, email);
		
		pservice.addPassageiro(p);
		
		return "redirect:/passageiros";
	}
	
	@RequestMapping(value="/update-pass", method=RequestMethod.POST)
	public ModelAndView update(@Valid Passageiro p) {
		pservice.updatePassageiro(p);
		return listar();
	}
	
	@RequestMapping("/edit-pass/{id}")
	public ModelAndView editar(@PathVariable int id) {
		return add(pservice.getPassageiroById(id));
	}
	
	@RequestMapping("/delete-pass/{id}")
	public String deletePassageiro(@PathVariable int id) {
		pservice.deletePassageiro(id);
		
		return "redirect:/passageiros";
	}
	
	@GetMapping("/add")
	public ModelAndView add(Passageiro passageiro) {
		
		ModelAndView mv = new ModelAndView("/pages/editar-passageiros");
		mv.addObject("passObj", passageiro);
		
		return mv;
	}
	
	
}

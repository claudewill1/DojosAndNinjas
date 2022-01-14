package com.springboot.claude.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.claude.mvc.models.Dojo;
import com.springboot.claude.mvc.models.Ninja;
import com.springboot.claude.mvc.services.MainService;

@Controller
public class MainController {
	private final MainService service;
	
	public MainController(MainService service) {
		this.service = service;
	}
	
	/////////// GET ROUTES /////////////
	@GetMapping("/")
	public String index() {
		return "redirect:/dojos";
	}
	
	@GetMapping("/dojos")
	public String dojos(@ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> dojos = service.getAllDojos();
		
		model.addAttribute("dojos",dojos);
		
		return "dashboard.jsp";
	}
	
	@GetMapping("/ninjas")
	public String ninjas(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = service.getAllDojos();
		
		
		model.addAttribute("dojos", dojos);
		
		
		return "new_ninja.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String ninjas(Model model, @PathVariable(value="id") Long id) {
		
		Dojo dojo = service.findDojoById(id);
		
		
		model.addAttribute("dojo",dojo);
		
		return "show_dojo.jsp";
	}
	
	//////// POST ROUTES /////////
	@PostMapping("/dojos")
	public String makeDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "new_dojo.jsp";
		}
		service.createDojo(dojo);
		return "redirect:/dojos";
	}
	
	@PostMapping("/ninjas")
	public String makeNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "new_ninja.jsp";
		}
		service.createNinja(ninja);
		return "redirect:/";
	}
}


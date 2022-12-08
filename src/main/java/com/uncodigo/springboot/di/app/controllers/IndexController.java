package com.uncodigo.springboot.di.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.uncodigo.springboot.di.app.models.service.MiServicio;

@Controller
public class IndexController {
	
	private MiServicio service = new MiServicio();

	@GetMapping({"/index", "/", ""})
	public String index(Model model) {
		
		model.addAttribute("objeto", service.operacion());
		
		return "index";
	}
	
}

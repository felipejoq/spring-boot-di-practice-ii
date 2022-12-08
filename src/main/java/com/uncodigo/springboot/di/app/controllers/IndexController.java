package com.uncodigo.springboot.di.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.uncodigo.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController {
	
	//Anotación de Spring que sirve para inyectar un componente registrado en el proyecto. (Beans).
	
	private IServicio service;
	
	// @Autowired <- Nueva funcionalidad. Al inyectar por Constructor se puede obviar la anotación. 
	public IndexController(IServicio service) {
		this.service = service;
	}

	@GetMapping({"/index", "/", ""})
	public String index(Model model) {
		
		model.addAttribute("objeto", service.operacion());
		
		return "index";
	}
	
}

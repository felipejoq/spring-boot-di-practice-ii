package com.uncodigo.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component
public class MiServicio {

	public String operacion() {
		return "Ejecutando algún proceso desde la clase MiServicio.";
	}
	
}

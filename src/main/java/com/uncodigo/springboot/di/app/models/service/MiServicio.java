package com.uncodigo.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioSimple") //Nombro mi componente para luego generar diferentes implementaciones.
public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		return "Ejecutando algún proceso desde la clase MiServicioSimple.";
	}
	
}

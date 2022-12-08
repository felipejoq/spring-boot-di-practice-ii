package com.uncodigo.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

//@Component("miServicioComplejo") //Nombro mi componente para luego generar diferentes implementaciones.
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "Ejecutando algún proceso desde la clase MiServicioComplejo.";
	}
	
}

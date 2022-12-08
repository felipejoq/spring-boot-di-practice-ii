package com.uncodigo.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("miServicioSimplePrincipal") //Nombro mi componente para luego generar diferentes implementaciones.
public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		return "Ejecutando algún proceso desde la clase MiServicioSimple.";
	}
	
}

package com.uncodigo.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.uncodigo.springboot.di.app.models.domain.ItemFactura;
import com.uncodigo.springboot.di.app.models.domain.Producto;
import com.uncodigo.springboot.di.app.models.service.IServicio;
import com.uncodigo.springboot.di.app.models.service.MiServicio;
import com.uncodigo.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimplePrincipal")
	@Primary
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}

	@Bean("itemsFactura")
	public List<ItemFactura> registrearItems() {

		Producto producto1 = new Producto("Play Station", 500000);
		Producto producto2 = new Producto("Cámara Sony", 350000);

		ItemFactura linea1 = new ItemFactura(producto1, 3);
		ItemFactura linea2 = new ItemFactura(producto2, 1);

		return Arrays.asList(linea1, linea2);

	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrearItemsOficina() {

		Producto producto1 = new Producto("Monitor LG", 250000);
		Producto producto2 = new Producto("Consola Play Station", 586000);
		Producto producto3 = new Producto("Multifuncional HP", 26900);
		Producto producto4 = new Producto("Escritorio Oficina", 186000);

		ItemFactura linea1 = new ItemFactura(producto1, 3);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 2);
		ItemFactura linea4 = new ItemFactura(producto4, 3);

		return Arrays.asList(linea1, linea2, linea3, linea4);

	}

}

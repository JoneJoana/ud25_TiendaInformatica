package com.ud25_TiendaInformatica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ud25_TiendaInformatica.dto.Articulos;
import com.ud25_TiendaInformatica.service.ArticulosServiceImpl;


@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticulosServiceImpl artServImpl;
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos(){
		return artServImpl.listArticulos();
	}

	@GetMapping("/articulos/{id}")
	public Articulos findByID(@PathVariable(name="id") int id) {
		return artServImpl.findByID(id);
	}
	
	@GetMapping("/articulos/nombre/{nombre}")
	public List<Articulos> findByNombre(@PathVariable(name="nombre") String nombre) {
		return artServImpl.findByName(nombre);
	}
	
	@GetMapping("/articulos/fabricante/{fabricante}")	
	public List<Articulos> findByFabricante(@PathVariable(name="fabricante") String fabricante){
		return artServImpl.findByFabricante(fabricante);
	}
}

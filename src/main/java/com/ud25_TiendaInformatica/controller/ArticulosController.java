package com.ud25_TiendaInformatica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ud25_TiendaInformatica.dto.Articulos;
import com.ud25_TiendaInformatica.dto.Fabricantes;
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
	public List<Articulos> findByFabricante(@PathVariable(name="fabricante") Fabricantes fabricante){				
		return artServImpl.findByFabricante(fabricante);
	}
	
	@PostMapping("/articulos")
	public String guardarArticulo(@RequestBody Articulos articulo) {				
		//validar datos que entran por body
		Articulos artInput = new Articulos(articulo.getNombre(),articulo.getPrecio(),articulo.getFabricante());				
		artServImpl.saveArticulo(artInput);
		return "Articulo guardado correctamente";
	}
	
	@DeleteMapping("/articulos/{id}")
	public void deleteArticulo(@PathVariable(name="id") int id) {
		artServImpl.deleteArticulo(id);
	}
	
	@PutMapping("/articulos/{id}")
	public Articulos actualizarArticulo(@PathVariable(name="id") int id, @RequestBody Articulos articulo) {
		Articulos art_selec = new Articulos();
		Articulos art_actualizado = new Articulos();
		
		art_selec = artServImpl.findByID(id);
		
		art_selec.setNombre(articulo.getNombre());
		art_selec.setPrecio(articulo.getPrecio());
		art_selec.setFabricante(articulo.getFabricante());
		
		art_actualizado = artServImpl.saveArticulo(art_selec);
		
		return art_actualizado;
	}
	
}

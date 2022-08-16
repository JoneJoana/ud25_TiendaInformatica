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
import com.ud25_TiendaInformatica.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {

	@Autowired
	FabricantesServiceImpl fabriServImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes(){
		return fabriServImpl.listFabricantes();
	}

	@GetMapping("/fabricantes/{id}")
	public Fabricantes findByID(@PathVariable(name="id") int id) {
		return fabriServImpl.findByID(id);
	}
	
	@GetMapping("/fabricantes/nombre/{nombre}")
	public List<Fabricantes> findByNombre(@PathVariable(name="nombre") String nombre) {
		return fabriServImpl.findByName(nombre);
	}
	
	@PostMapping("/fabricantes") //crear
	public String guardarFabricante(@RequestBody Fabricantes fabricante) {				
		//validar datos que entran por body , que no se repita el nombre
		boolean exists = false;
		
		for (Fabricantes f : fabriServImpl.listFabricantes()) {
			if(f.getNombre().equals(fabricante.getNombre())) {
				exists = true;
			}
		}
		if(!exists) {
			fabriServImpl.saveFabricante(fabricante);
			return "Fabricante guardado!";
		}
		return "Fabricante ya existe!";			
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void deleteFabricante(@PathVariable(name="id") int id) {
		fabriServImpl.deleteFabricante(id);
	}
	
	@PutMapping("/fabricantes/{id}") //actualizar
	public Fabricantes actualizarFabricante(@PathVariable(name="id") int id, @RequestBody Fabricantes fabricante) {
		Fabricantes fabr_selec = new Fabricantes();
		Fabricantes fabr_actualizado = new Fabricantes();
		
		fabr_selec = fabriServImpl.findByID(id);
		
		fabr_selec.setNombre(fabricante.getNombre());
		
		fabr_actualizado = fabriServImpl.saveFabricante(fabr_selec);
		
		return fabr_actualizado;
	}
	
}

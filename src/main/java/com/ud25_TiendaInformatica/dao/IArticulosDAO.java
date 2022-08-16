package com.ud25_TiendaInformatica.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ud25_TiendaInformatica.dto.Articulos;
import com.ud25_TiendaInformatica.dto.Fabricantes;

public interface IArticulosDAO extends JpaRepository<Articulos,Integer>{
	
	public List<Articulos> findByNombre(String name);

	public List<Articulos> findByFabricante(Fabricantes fabricante);
	
}

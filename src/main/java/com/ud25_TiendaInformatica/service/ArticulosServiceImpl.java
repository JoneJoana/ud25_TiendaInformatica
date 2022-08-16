package com.ud25_TiendaInformatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud25_TiendaInformatica.dao.IArticulosDAO;
import com.ud25_TiendaInformatica.dto.Articulos;
import com.ud25_TiendaInformatica.dto.Fabricantes;

@Service
public class ArticulosServiceImpl implements IArticulosService {
	
	@Autowired
	IArticulosDAO iArticulosDAO;

	@Override
	public List<Articulos> listArticulos() {
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos saveArticulo(Articulos articulo) {
		return iArticulosDAO.save(articulo);		
	}

	@Override
	public Articulos findByID(int id) {
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public List<Articulos> findByName(String name) {
		return iArticulosDAO.findByNombre(name);
	}
	
	@Override
	public List<Articulos> findByFabricante(Fabricantes fabricante) {
		return iArticulosDAO.findByFabricante(fabricante);
	}

	@Override
	public void deleteArticulo(int id) {
		iArticulosDAO.deleteById(id);	
	}
	
}

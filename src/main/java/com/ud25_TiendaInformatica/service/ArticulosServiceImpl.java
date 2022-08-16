package com.ud25_TiendaInformatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ud25_TiendaInformatica.dao.IArticulosDAO;
import com.ud25_TiendaInformatica.dto.Articulos;

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
	public void deleteArticulo(int id) {
		iArticulosDAO.deleteById(id);	
	}
	
}

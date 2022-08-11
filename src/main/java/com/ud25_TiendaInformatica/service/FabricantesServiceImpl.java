package com.ud25_TiendaInformatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ud25_TiendaInformatica.dao.IFabricantesDAO;
import com.ud25_TiendaInformatica.dto.Fabricantes;

public class FabricantesServiceImpl implements IFabricantesService {
	
	@Autowired
	IFabricantesDAO iFabricantesDAO;

	@Override
	public List<Fabricantes> listFabricantes() {
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricantes saveFabricante(Fabricantes fabricante) {
		return iFabricantesDAO.save(fabricante);		
	}

	@Override
	public Fabricantes findByID(int id) {
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public List<Fabricantes> findByName(String name) {
		return iFabricantesDAO.findByName(name);
	}

	@Override
	public void deleteArticulo(int id) {
		iFabricantesDAO.deleteById(id);	
	}

}

package com.ud25_TiendaInformatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud25_TiendaInformatica.dao.IFabricantesDAO;
import com.ud25_TiendaInformatica.dto.Fabricantes;

@Service
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
		return iFabricantesDAO.findByNombre(name);
	}

	@Override
	public void deleteFabricante(int id) {
		iFabricantesDAO.deleteById(id);	
	}

}

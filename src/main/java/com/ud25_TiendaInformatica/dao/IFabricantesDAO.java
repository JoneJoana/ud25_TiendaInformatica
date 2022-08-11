package com.ud25_TiendaInformatica.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ud25_TiendaInformatica.dto.Fabricantes;

public interface IFabricantesDAO extends JpaRepository<Fabricantes,Integer>{

	public List<Fabricantes> findByName(String name);
	
}

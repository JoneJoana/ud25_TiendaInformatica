package com.ud25_APIsSpring.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ud25_APIsSpring.dto.Articulos;

public interface IArticulosDAO extends JpaRepository<Articulos,Integer>{
	
	public List<Articulos> findByName(String name);
	
}

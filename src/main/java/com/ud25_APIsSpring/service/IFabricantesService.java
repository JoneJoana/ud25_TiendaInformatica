package com.ud25_APIsSpring.service;

import java.util.List;

import com.ud25_APIsSpring.dto.Fabricantes;

public interface IFabricantesService {
	
	//Metodos del CRUD
	public List<Fabricantes> listFabricantes(); //ALL -  GET
	
	public Fabricantes saveFabricante(Fabricantes fabricante); //CREATE || UPDATE
	
	public Fabricantes findByID(int id); //READ, SOLO 1 REGISTRO O NINGUNO
	
	public List<Fabricantes> findByName(String name);  //GET BY NAME
		
	public void deleteArticulo(int id);  //DELETE

}

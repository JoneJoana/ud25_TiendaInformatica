package com.ud25_APIsSpring.service;

import java.util.List;

import com.ud25_APIsSpring.dto.Articulos;

public interface IArticulosService {

	//Metodos del CRUD
	public List<Articulos> listArticulos(); //ALL -  GET
	
	public Articulos saveArticulo(Articulos articulo); //CREATE || UPDATE
	
	public Articulos findByID(int id); //READ, SOLO 1 REGISTRO O NINGUNO
	
	public List<Articulos> findByName(String name); // GET BY NAME
	
	public List<Articulos> listArticulosXFabricante(String fabricante); // GET - valorar utilidad
		
	public void deleteArticulo(int id);  //DELETE	
	
}

package com.ud25_TiendaInformatica.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="fabricantes")
public class Fabricantes {
	
	@Id
	//busca ultimo valor e incrementa desde id final de db
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fabricante")
    private List<Articulos> articulos;
	
	
	public Fabricantes() {}
	
	public Fabricantes(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}	
	
	/**
	 * @return the articulos
	 */
	public List<Articulos> getArticulos() {
		return articulos;
	}

	/**
	 * @param articulo 
	 * the articulos to set
	 */
	public void setArticulo(List<Articulos> articulos) {
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		return "Fabricantes [id=" + id + ", nombre=" + nombre + "]";
	}

}

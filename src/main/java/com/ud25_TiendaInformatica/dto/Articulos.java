package com.ud25_TiendaInformatica.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulos {
	
	@Id
	//busca ultimo valor e incrementa desde id final de db
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;	
	@Column(name = "precio")
	private int precio;
		
	@ManyToOne
    @JoinColumn(name="fabricante")
    private Fabricantes fabricante;
	
	public Articulos() {}
	
	public Articulos(String nombre, int precio, Fabricantes fabricante) {
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Fabricantes getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricantes fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Articulos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + "]";
	}
	
}

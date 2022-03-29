package com.idprogramming.springboot.app.item.models;

import java.util.Date;

public class Producto {

	private Long id;
	private String nombre;
	private Double precio;
	private Date createAt;
	public Long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
}

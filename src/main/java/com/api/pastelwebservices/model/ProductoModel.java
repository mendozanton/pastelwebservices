package com.api.pastelwebservices.model;

import java.util.List;


public class ProductoModel {
	private Long idProducto;
	private String nombre;
	private String descripcion;
	private String descripcion2;
	private Double precio;
	private Integer stock;
	private List<ImagenModel> imagenes;
	private String detalles;
	private String estado;
	
	public ProductoModel() {
	}
	
	
	public ProductoModel(Long idProducto, String nombre, String descripcion, String descripcion2, Double precio,
			Integer stock, List<ImagenModel> imagenes, String detalles, String estado) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.descripcion2 = descripcion2;
		this.precio = precio;
		this.stock = stock;
		this.imagenes = imagenes;
		this.detalles = detalles;
		this.estado = estado;
	}


	public final String getDescripcion2() {
		return descripcion2;
	}


	public final void setDescripcion2(String descripcion2) {
		this.descripcion2 = descripcion2;
	}


	public final List<ImagenModel> getImagenes() {
		return imagenes;
	}
	public final void setImagenes(List<ImagenModel> imagenes) {
		this.imagenes = imagenes;
	}
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}

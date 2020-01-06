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
	private Long detalle;
	private Long estado;
	
	public ProductoModel() {
	}

	public ProductoModel(Long idProducto, String nombre, String descripcion, String descripcion2, Double precio,
			Integer stock, List<ImagenModel> imagenes, Long detalle, Long estado) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.descripcion2 = descripcion2;
		this.precio = precio;
		this.stock = stock;
		this.imagenes = imagenes;
		this.detalle = detalle;
		this.estado = estado;
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

	public String getDescripcion2() {
		return descripcion2;
	}

	public void setDescripcion2(String descripcion2) {
		this.descripcion2 = descripcion2;
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

	public List<ImagenModel> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<ImagenModel> imagenes) {
		this.imagenes = imagenes;
	}

	public Long getDetalle() {
		return detalle;
	}

	public void setDetalle(Long detalle) {
		this.detalle = detalle;
	}

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}

	
}

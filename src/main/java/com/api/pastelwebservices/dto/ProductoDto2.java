package com.api.pastelwebservices.dto;

import java.util.List;

import com.api.pastelwebservices.entity.ProductoDetalle;
import com.api.pastelwebservices.model.ImagenModel;

public class ProductoDto2 {
	private Long idProducto;
	private String nombre;
	private String descripcion;
	private String descripcion2;
	private Integer cantidad;
	private Double precio;
	private Integer stock;
	private List<ImagenModel> imagenes;
	private Long idDetalle;
	private Long idEstado;
	
	
	public ProductoDto2(Long idProducto, String nombre, String descripcion, String descripcion2, Integer cantidad,
			Double precio, Integer stock, List<ImagenModel> imagenes, Long idDetalle, Long idEstado) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.descripcion2 = descripcion2;
		this.cantidad = cantidad;
		this.precio = precio;
		this.stock = stock;
		this.imagenes = imagenes;
		this.idDetalle = idDetalle;
		this.idEstado = idEstado;
	}


	public Long getIdDetalle() {
		return idDetalle;
	}


	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
	}


	public ProductoDto2() {
	}
	
	
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
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

	public Long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	
	
}

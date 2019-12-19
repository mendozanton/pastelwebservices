package com.api.pastelwebservices.dto;

public class ProductoDto {
	private Long idProducto;
	private Integer cantidad;
	
	public ProductoDto() {
	}

	public ProductoDto(Long idProducto, Integer cantidad) {
		this.idProducto = idProducto;
		this.cantidad = cantidad;
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
	
	
}

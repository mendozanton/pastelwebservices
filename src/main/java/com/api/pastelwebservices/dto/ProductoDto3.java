package com.api.pastelwebservices.dto;

public class ProductoDto3 {
	private Long idProducto;
	private Integer cantidad;
	private Long idEstado;
	
	public ProductoDto3() {
	}

	
	public ProductoDto3(Long idProducto, Integer cantidad, Long idEstado) {
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.idEstado = idEstado;
	}


	public Long getIdEstado() {
		return idEstado;
	}


	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
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

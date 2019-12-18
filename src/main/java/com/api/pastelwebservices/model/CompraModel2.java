package com.api.pastelwebservices.model;

import java.util.Date;

public class CompraModel2 {
	private Long idCompra;
	private Integer cantidad;
	private Double monto;
	private Long producto;
	
	public CompraModel2() {
	}

	public CompraModel2(Long idCompra, Integer cantidad, Double monto, Long producto) {
		this.idCompra = idCompra;
		this.cantidad = cantidad;
		this.monto = monto;
		this.producto = producto;
	}

	public Long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Long getProducto() {
		return producto;
	}

	public void setProducto(Long producto) {
		this.producto = producto;
	}
	
	
}

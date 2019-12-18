package com.api.pastelwebservices.model;

import java.util.Date;

public class CompraModel {
	
	private Long idCompra;
	private Date fecha;
	private Integer cantidad;
	private Double monto;
	private Long producto;
	private Long pedido;
	
	public CompraModel() {
	}

	public CompraModel(Long idCompra, Date fecha, Integer cantidad, Double monto, Long producto, Long pedido) {
		this.idCompra = idCompra;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.monto = monto;
		this.producto = producto;
		this.pedido = pedido;
	}

	public Long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	public Long getPedido() {
		return pedido;
	}

	public void setPedido(Long pedido) {
		this.pedido = pedido;
	}
	
	
	
}

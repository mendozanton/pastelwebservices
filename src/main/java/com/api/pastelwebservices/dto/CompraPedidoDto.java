package com.api.pastelwebservices.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CompraPedidoDto {
	
	private List<ProductoCompraDto> producto;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",timezone ="America/Bogota")
	private Date envio;
	private Long prioridad;
	private Long usuario;
	
	public CompraPedidoDto() {
	}

	public CompraPedidoDto(List<ProductoCompraDto> producto, Date envio, Long prioridad, Long usuario) {
		this.producto = producto;
		this.envio = envio;
		this.prioridad = prioridad;
		this.usuario = usuario;
	}

	public List<ProductoCompraDto> getProducto() {
		return producto;
	}

	public void setProducto(List<ProductoCompraDto> producto) {
		this.producto = producto;
	}

	public Date getEnvio() {
		return envio;
	}

	public void setEnvio(Date envio) {
		this.envio = envio;
	}

	public Long getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Long prioridad) {
		this.prioridad = prioridad;
	}

	public Long getUsuario() {
		return usuario;
	}

	public void setUsuario(Long usuario) {
		this.usuario = usuario;
	}
	
	
}

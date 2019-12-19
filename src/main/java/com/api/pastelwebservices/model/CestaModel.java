package com.api.pastelwebservices.model;

import java.util.Date;
import java.util.List;

public class CestaModel {
	private Long idCesta;
	private Date fecha;
	private List<ProductoModel> productos;
	private Long idUsuario;
	
	
	public CestaModel() {
	}
	
	public CestaModel(Long idCesta, Date fecha, List<ProductoModel> productos, Long idUsuario) {
		this.idCesta = idCesta;
		this.fecha = fecha;
		this.productos = productos;
		this.idUsuario = idUsuario;
	}

	public Long getIdCesta() {
		return idCesta;
	}
	public void setIdCesta(Long idCesta) {
		this.idCesta = idCesta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public List<ProductoModel> getProductos() {
		return productos;
	}
	public void setProductos(List<ProductoModel> productos) {
		this.productos = productos;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
}

package com.api.pastelwebservices.dto;

import java.util.Date;
import java.util.List;

import com.api.pastelwebservices.model.ProductoModel;

public class CestaDto2 {
	private Long idCesta;
	private Long idUsuario;
	private Date fecha;
	private List<ProductoDto2> productos;
	
	public CestaDto2() {
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
	
	public List<ProductoDto2> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoDto2> productos) {
		this.productos = productos;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}

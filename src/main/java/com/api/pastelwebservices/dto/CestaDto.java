package com.api.pastelwebservices.dto;
import java.util.List;

import com.api.pastelwebservices.model.ProductoModel;

public class CestaDto {
	private List<ProductoModel> productos;
	private Long idUsuario;
	
	
	public CestaDto() {
	}

	public CestaDto(List<ProductoModel> productos, Long idUsuario) {
		this.productos = productos;
		this.idUsuario = idUsuario;
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

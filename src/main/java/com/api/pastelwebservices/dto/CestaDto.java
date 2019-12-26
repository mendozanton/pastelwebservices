package com.api.pastelwebservices.dto;
import java.util.List;

import com.api.pastelwebservices.model.ProductoModel;

public class CestaDto {
	private Long idUsuario;
	private ProductoDto3 producto;
	
	
	
	public CestaDto() {
	}

	public CestaDto(ProductoDto3 producto, Long idUsuario) {
		this.producto = producto;
		this.idUsuario = idUsuario;
	}

	public ProductoDto3 getProducto() {
		return producto;
	}

	public void setProductos(ProductoDto3 producto) {
		this.producto = producto;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	
}

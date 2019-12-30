package com.api.pastelwebservices.model;

public class UsuarioUpdateTelef {
	private Long idUsuario;
	private Integer telefono;
	
	public UsuarioUpdateTelef() {
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public UsuarioUpdateTelef(Long idUsuario, Integer telefono) {
		this.idUsuario = idUsuario;
		this.telefono = telefono;
	}
	
	
}

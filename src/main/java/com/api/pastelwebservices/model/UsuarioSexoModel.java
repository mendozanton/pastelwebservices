package com.api.pastelwebservices.model;

public class UsuarioSexoModel {
	private Long idUsuarioSexo;
	private String nombre;
	
	public Long getIdUsuarioSexo() {
		return idUsuarioSexo;
	}

	public void setIdUsuarioSexo(Long idUsuarioSexo) {
		this.idUsuarioSexo = idUsuarioSexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public UsuarioSexoModel(Long idUsuarioSexo, String nombre) {
		this.idUsuarioSexo = idUsuarioSexo;
		this.nombre = nombre;
	}

	public UsuarioSexoModel() {
	}
	
	
}

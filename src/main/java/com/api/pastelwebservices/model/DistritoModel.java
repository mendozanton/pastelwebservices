package com.api.pastelwebservices.model;

public class DistritoModel {
	private Long idDistrito;
	private String nombre;
	
	public DistritoModel() {
	}

	public DistritoModel(Long idDistrito, String nombre) {
		this.idDistrito = idDistrito;
		this.nombre = nombre;
	}

	public Long getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(Long idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}

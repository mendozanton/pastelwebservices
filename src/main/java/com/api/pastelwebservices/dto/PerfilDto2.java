package com.api.pastelwebservices.dto;


public class PerfilDto2 {
	private Long idPerfil;
	private String nombre;
	private String descripcion;
	private Long idRol;
	
	      
	public PerfilDto2() {
	}


	public PerfilDto2(Long idPerfil, String nombre, String descripcion, Long idRol) {
		this.idPerfil = idPerfil;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.idRol = idRol;
	}


	public Long getIdPerfil() {
		return idPerfil;
	}


	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Long getIdRol() {
		return idRol;
	}


	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	
	
	
}

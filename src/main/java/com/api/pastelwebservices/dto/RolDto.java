package com.api.pastelwebservices.dto;

import java.util.List;

import com.api.pastelwebservices.entity.Perfil;

public class RolDto {
	private Long idRol;
	private String nombre;
	private String descripcion;
	private List<Perfil> perfiles;
	
	public RolDto() {
	}
	
	
	public RolDto(Long idRol, String nombre, String descripcion, List<Perfil> perfiles) {
		this.idRol = idRol;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.perfiles = perfiles;
	}


	public Long getIdRol() {
		return idRol;
	}
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
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
	public List<Perfil> getPerfiles() {
		return perfiles;
	}
	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}
	
	
}

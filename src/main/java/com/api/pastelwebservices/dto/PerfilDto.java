package com.api.pastelwebservices.dto;

import java.util.List;

import com.api.pastelwebservices.entity.Menu;

public class PerfilDto {
	private Long idPerfil;
	private String nombre;
	private String descripcion;
	private List<Menu> menus;
	
	public PerfilDto() {
	}
	
	
	public PerfilDto(Long idPerfil, String nombre, String descripcion, List<Menu> menus) {
		this.idPerfil = idPerfil;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.menus = menus;
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
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	
}


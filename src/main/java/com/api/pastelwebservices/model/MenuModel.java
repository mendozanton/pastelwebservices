package com.api.pastelwebservices.model;


public class MenuModel {
	private Long idMenu;
	private String nombre;
	private String ruta;
	private Long idEstado;
	private Long idGrupo;
	public MenuModel() {
	}
	public MenuModel(Long idMenu, String nombre, String ruta, Long idEstado, Long idGrupo) {
		this.idMenu = idMenu;
		this.nombre = nombre;
		this.ruta = ruta;
		this.idEstado = idEstado;
		this.idGrupo = idGrupo;
	}
	public Long getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public Long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	public Long getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}
	
	
	
}

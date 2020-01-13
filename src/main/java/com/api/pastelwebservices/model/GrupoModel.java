package com.api.pastelwebservices.model;


public class GrupoModel {
	private Long idGrupo;
	
	private String nombre;

	public GrupoModel() {
	}

	public GrupoModel(Long idGrupo, String nombre) {
		this.idGrupo = idGrupo;
		this.nombre = nombre;
	}

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
}

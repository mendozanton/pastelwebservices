package com.api.pastelwebservices.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Grupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_gru")
	private Long idGrupo;
	
	@Column(name = "nom_gru")
	private String nombre;
	
	@OneToMany(mappedBy = "grupo",cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JsonIgnore
	private Set<Menu> menus;

	
	public Grupo() {
	}

	
	public Grupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}


	public Grupo(Long idGrupo, String nombre) {
		this.idGrupo = idGrupo;
		this.nombre = nombre;
	}


	public Grupo(Long idGrupo, String nombre, Set<Menu> menus) {
		this.idGrupo = idGrupo;
		this.nombre = nombre;
		this.menus = menus;
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

	public Set<Menu> getMenus() {
		return menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}
	
	
	
}

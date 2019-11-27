package com.api.pastelwebservices.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol")
	private Long idRol;
	
	@Column(name = "nom_rol")
	private String nombre;
	
	@Column(name = "des_rol")
	private String descripcion;

	@ManyToMany(mappedBy = "roles",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("roles")
	private Set<Perfil> perfiles;
	
	@OneToMany(mappedBy = "rol",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("rol")
	private Set<Usuario> usuarios;
	
	public Rol() {
	}


	public Rol(Long idRol) {
		this.idRol = idRol;
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

/*
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	*/
	
}

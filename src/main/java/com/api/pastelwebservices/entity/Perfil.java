package com.api.pastelwebservices.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_per")
	private Long idPerfil;
	
	@Column(name = "nom_per")
	private String nombre;
	
	@Column(name = "des_per")
	private String descripcion;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_rol", foreignKey = @ForeignKey(name = "fk_perfil_rol"))
	//@JsonIgnoreProperties("perfiles")
	@JsonIgnore
	private Set<Rol> roles;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_men", foreignKey = @ForeignKey(name = "fk_perfil_menu"))
	//@JsonIgnoreProperties("perfiles")
	@JsonIgnore
	private Set<Menu> menus;
	
	@OneToMany(mappedBy = "rol")
	@JsonIgnore
	private Set<Usuario> usuarios;

	public Perfil() {
	}

	public Perfil(Long idPerfil) {
		this.idPerfil = idPerfil;
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

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Menu> getMenus() {
		return menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}
	
	
	
	
}

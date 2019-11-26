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
	@JsonIgnoreProperties("perfiles")
	private Set<Rol> roles;
	
	@OneToMany(mappedBy = "rol")
	@JsonIgnoreProperties("perfil")
	private Set<Usuario> usuarios;

	public Perfil() {
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
	
	
}

package com.api.pastelwebservices.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_est")
	private Long idEstado;
	
	@Column(name = "nom_est", length = 15)
	private String nombre;
	
	@Column(name = "des_est", length = 30)
	private String descripcion;
	
	@OneToMany(mappedBy = "estado",cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JsonIgnoreProperties("estado")
	private Set<Usuario> usuarios;
	
	@OneToMany(mappedBy = "estado",cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JsonIgnoreProperties("estado")
	private Set<Producto> productos;

	public Estado() {
	}

	public Estado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
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

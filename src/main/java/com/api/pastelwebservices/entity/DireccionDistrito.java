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
public class DireccionDistrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dis")
	private Long idDireccionDistrito;
	
	@Column(name = "nom_dis", nullable = false, length = 30)
	private String nombre;
	
	@OneToMany(mappedBy = "distrito", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("distrito")
	private Set<Direccion> direcciones;

	public DireccionDistrito() {
	}

	public Set<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Set<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	public Long getIdDireccionDistrito() {
		return idDireccionDistrito;
	}

	public void setIdDireccionDistrito(Long idDireccionDistrito) {
		this.idDireccionDistrito = idDireccionDistrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}

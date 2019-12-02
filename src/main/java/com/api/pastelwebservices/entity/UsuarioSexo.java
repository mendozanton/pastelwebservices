package com.api.pastelwebservices.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class UsuarioSexo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sex")
	private Long idUsuarioSexo;
	
	@Column(name = "nom_sex", nullable = false)
	@NotNull
	private String nombre;

	@OneToMany(mappedBy = "sexo")
	@JsonIgnoreProperties("sexo")
	private Set<Usuario> usuarios;
	
	public UsuarioSexo() {

	}

	public UsuarioSexo(Long idUsuarioSexo, String nombre) {
		this.idUsuarioSexo = idUsuarioSexo;
		this.nombre = nombre;
	}


	public Long getIdUsuarioSexo() {
		return idUsuarioSexo;
	}

	public void setIdUsuarioSexo(Long idUsuarioSexo) {
		this.idUsuarioSexo = idUsuarioSexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	
}

package com.api.pastelwebservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@Column(length = 10, nullable = false)
	private String nombre;
	
	@Column(length = 10, nullable = false)
	private String apellido;
	
	@Column(columnDefinition = "char", nullable = false)
	private String sexo;
	
	@Column(columnDefinition = "numeric", length = 2)
	private Integer edad;
	
	@Column(length = 320)
	private String email;
	
	@Column(columnDefinition = "numeric", length = 9, nullable = true)
	private Integer telefono;
	
	@Column(length = 12, nullable = false)
	private String clave;
	
	@Column(length = 15)
	private String tipo;
	
	@Column(length = 1)
	private String estado;

	public Usuario() {
	}

	public Usuario(Long idUsuario, String nombre, String apellido, String sexo, Integer edad, String email,
			Integer telefono, String clave, String tipo, String estado) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		this.email = email;
		this.telefono = telefono;
		this.clave = clave;
		this.tipo = tipo;
		this.estado = estado;
	}
	
	
}

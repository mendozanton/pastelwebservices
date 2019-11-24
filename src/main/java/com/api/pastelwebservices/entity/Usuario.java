package com.api.pastelwebservices.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	private String password;
	
	@Column(length = 15)
	private String tipo;
	
	@Column(length = 1)
	private String estado;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idDireccion", foreignKey = @ForeignKey(name = "FK_Direccion_usuario"))
	@JsonIgnoreProperties("usuarios")
	private Direccion direccion;
	
	public Usuario() {
	}

	public Usuario(Long idUsuario, String nombre, String apellido, String sexo, Integer edad, String email,
			Integer telefono, String password, String tipo, String estado) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		this.email = email;
		this.telefono = telefono;
		this.password = password;
		this.tipo = tipo;
		this.estado = estado;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
}

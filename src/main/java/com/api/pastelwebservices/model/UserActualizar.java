package com.api.pastelwebservices.model;

public class UserActualizar {
	private Long idUsuario;
	private String nombre;
	private String apellido;
	private Integer edad;
	private Integer telefono;
	private Long sexo;
	
	public UserActualizar() {
	}

	public UserActualizar(Long idUsuario, String nombre, String apellido, Integer edad, Integer telefono, Long sexo) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.sexo = sexo;
	}

	public Long getSexo() {
		return sexo;
	}

	public void setSexo(Long sexo) {
		this.sexo = sexo;
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	
	
}

package com.api.pastelwebservices.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UsuarioRegistrar2 {
	private String nombre;
	private String apellido;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd",timezone ="America/Bogota")
	private Date nacimiento;
	private Integer telefono;
	private Integer sexo;
	private String email;
	private String password;
	
	
	public UsuarioRegistrar2() {
	}
	
	
	public UsuarioRegistrar2(String nombre, String apellido, Date nacimiento, Integer telefono, Integer sexo,
			String email, String password) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.telefono = telefono;
		this.sexo = sexo;
		this.email = email;
		this.password = password;
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
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public Integer getSexo() {
		return sexo;
	}
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

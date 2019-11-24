package com.api.pastelwebservices.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDireccion;
	
	@Column(length = 50, nullable = false)
	private String distrito;
	
	@Column(length = 20, nullable = false)
	private String ciudad;
	
	@Column(length = 35)
	private String avenida;
	
	@Column(length = 20)
	private String urbanizacion;
	
	@Column(length = 30)
	private String calle;
	
	@Column(length = 30)
	private String departamento;
	
	@Column(length = 20)
	private String lote;
	
	@Column(columnDefinition = "smallint")
	private Integer piso;
	
	@Column(length = 10, nullable = false)
	private Integer codigoPostal;
	
	@Column(length = 100, nullable = false)
	private String referencia;
	
	@OneToMany(mappedBy = "direccion")
	@JsonIgnoreProperties("direccion")
	private Set<Usuario> usuarios;
	
	public Direccion() {
	}

	public Direccion(Long idDireccion, String distrito, String ciudad, String avenida, String urbanizacion,
			String calle, String departamento, String lote, Integer piso, Integer codigoPostal, String referencia) {
		this.idDireccion = idDireccion;
		this.distrito = distrito;
		this.ciudad = ciudad;
		this.avenida = avenida;
		this.urbanizacion = urbanizacion;
		this.calle = calle;
		this.departamento = departamento;
		this.lote = lote;
		this.piso = piso;
		this.codigoPostal = codigoPostal;
		this.referencia = referencia;
	}

	public Long getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getAvenida() {
		return avenida;
	}

	public void setAvenida(String avenida) {
		this.avenida = avenida;
	}

	public String getUrbanizacion() {
		return urbanizacion;
	}

	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
}

package com.api.pastelwebservices.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dir")
	private Long idDireccion;
	
	@Column(name = "ciu_dir", length = 20, nullable = false)
	private String ciudad;
	
	@Column(name = "aven_dir", length = 35)
	private String avenida;
	
	@Column(name = "urb_dir", length = 20)
	private String urbanizacion;
	
	@Column(name = "calle_dir", length = 30)
	private String calle;
	
	@Column(name = "dep_dir", length = 30)
	private String departamento;
	
	@Column(name = "lot_dir", length = 20)
	private String lote;
	
	@Column(name = "cod_pos_dir", length = 10, nullable = false)
	private Integer codigoPostal;
	
	@Column(name = "ref_dir", length = 100, nullable = false)
	private String referencia;
	
	@OneToMany(mappedBy = "direccion")
	@JsonIgnoreProperties("direccion")
	private Set<Usuario> usuarios;
	
	public Direccion() {
	}

	public Long getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
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

	
}

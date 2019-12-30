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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dir")
	private Long idDireccion;
	
	@Column(name = "aven_dir", length = 50)
	private String avenida;
	
	@Column(name = "urb_dir", length = 100)
	private String urbanizacion;
	
	@Column(name = "calle_dir", length = 50)
	private String calle;
	
	@Column(name = "ref_dir", length = 200, nullable = false)
	private String referencia;
	
	@OneToMany(mappedBy = "direccion", cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JsonIgnoreProperties("direccion")
	private Set<Usuario> usuarios;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_dis", foreignKey = @ForeignKey(name = "fk_distrito_direccion"))
	@JsonIgnoreProperties("direcciones")
	private DireccionDistrito distrito;
	
	public Direccion() {
	}


	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public DireccionDistrito getDistrito() {
		return distrito;
	}

	public void setDistrito(DireccionDistrito distrito) {
		this.distrito = distrito;
	}

	public Direccion(Long idDireccion) {
		this.idDireccion = idDireccion;
	}

	public Long getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
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

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	
}

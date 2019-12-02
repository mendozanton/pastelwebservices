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
	
	@Column(name = "urb_dir", length = 50)
	private String urbanizacion;
	
	@Column(name = "calle_dir", length = 50)
	private String calle;
	
	@Column(name = "sect_dir", length = 50)
	private String sector;
	
	@Column(name = "manz_dir", length = 50)
	private String manzana;
	
	@Column(name = "dep_dir", length = 50)
	private String departamento;
	
	@Column(name = "lot_dir", length = 10)
	private String lote;
	
	@Column(name = "cod_pos_dir", length = 10, nullable = false)
	private Integer codigoPostal;
	
	@Column(name = "ref_dir", length = 100, nullable = false)
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

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getManzana() {
		return manzana;
	}

	public void setManzana(String manzana) {
		this.manzana = manzana;
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

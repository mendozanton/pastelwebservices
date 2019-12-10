package com.api.pastelwebservices.model;


public class DireccionModel {
	
	private Long idDireccion;
	private String avenida;
	private String urbanizacion;
	private String calle;
	private String sector;
	private String manzana;
	private String departamento;
	private String lote;
	private Integer codigoPostal;
	private String referencia;
	private Long IdDistrito;
	
	public DireccionModel() {
	}
	

	public DireccionModel(Long idDireccion) {
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


	public Long getIdDistrito() {
		return IdDistrito;
	}


	public void setIdDistrito(Long idDistrito) {
		IdDistrito = idDistrito;
	}

	
	
}

package com.api.pastelwebservices.model;


public class DireccionModel {
	
	private String avenida;
	private String urbanizacion;
	private String calle;
	private String referencia;
	private Long idDistrito;
	
	public DireccionModel() {
	}
	
	

	public DireccionModel(String avenida, String urbanizacion, String calle, String referencia, Long idDistrito) {
		this.avenida = avenida;
		this.urbanizacion = urbanizacion;
		this.calle = calle;
		this.referencia = referencia;
		this.idDistrito = idDistrito;
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

	public Long getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(Long idDistrito) {
		this.idDistrito = idDistrito;
	}

	@Override
	public String toString() {
		return "DireccionModel [avenida=" + avenida + ", urbanizacion=" + urbanizacion + ", calle=" + calle
				+ ", referencia=" + referencia + ", idDistrito=" + idDistrito + "]";
	}
	
	
	
}

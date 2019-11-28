package com.api.pastelwebservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Factura {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id_fac")
	private Long idFactura;
	
//	@Column(name = "mont_fac")
	private Double monto;

	public Factura() {
	}

	public Long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	
}

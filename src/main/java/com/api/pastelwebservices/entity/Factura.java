package com.api.pastelwebservices.entity;

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

package com.api.pastelwebservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDireccion;
	
	@Column(length = 20, nullable = false)
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
	
	
	
}

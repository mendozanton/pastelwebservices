package com.api.pastelwebservices.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class CestaProductos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cest_prod")
	private Long idCestaProductos;
	
	@Column(name = "cant_cest_prod")
	private Integer cantidad;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_cest", foreignKey = @ForeignKey(name = "fk_cesta_cesta_productos"))
	@JsonIgnoreProperties("cestaProductos")
	private Cesta cesta;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_prod", foreignKey = @ForeignKey(name = "fk_producto_cesta_productos"))
	@JsonIgnoreProperties("cestaProductos")
	private Producto producto;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_est", foreignKey = @ForeignKey(name = "fk_estado_cesta_productos"))
	@JsonIgnoreProperties("cestaProductos")
	private Estado estado;
	

	public CestaProductos() {
	}

	public Long getIdCestaProductos() {
		return idCestaProductos;
	}

	public void setIdCestaProductos(Long idCestaProductos) {
		this.idCestaProductos = idCestaProductos;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Cesta getCesta() {
		return cesta;
	}

	public void setCesta(Cesta cesta) {
		this.cesta = cesta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}

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
public class ProductoDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prod_det")
	private Long idProductoDetalle;
	
	@Column(name = "tip_prod_det", length = 35)
	private String tipo;
	
	@Column(name = "sabo_prod_det", length = 25)
	private String sabor;

	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_prod", foreignKey = @ForeignKey(name = "fk_producto_detalle"))
	@JsonIgnoreProperties("detalles")
	private Producto producto;
	
	public ProductoDetalle() {
		
	}

	public Long getIdProductoDetalle() {
		return idProductoDetalle;
	}

	public void setIdProductoDetalle(Long idProductoDetalle) {
		this.idProductoDetalle = idProductoDetalle;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}

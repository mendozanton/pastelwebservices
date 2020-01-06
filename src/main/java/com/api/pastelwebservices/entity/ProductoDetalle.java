package com.api.pastelwebservices.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class ProductoDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prod_det")
	private Long idProductoDetalle;
	
	@Column(name = "tip_prod_det", length = 35)
	private String tipo;
	
	@OneToMany(mappedBy = "detalle", cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JsonIgnore
	private Set<Producto> producto;
	
	public ProductoDetalle() {
		
	}

	
	public ProductoDetalle(Long idProductoDetalle) {
		this.idProductoDetalle = idProductoDetalle;
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

	public Set<Producto> getProducto() {
		return producto;
	}

	public void setProducto(Set<Producto> producto) {
		this.producto = producto;
	}

	
}

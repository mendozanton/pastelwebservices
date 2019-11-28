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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prod")
	private Long idProducto;
	
	@Column(name = "nom_prod", length = 30, nullable = false)
	private String nombre;
	
	@Column(name = "des_prod", length = 120)
	private String descripcion;
	
	@Column(name = "prec_prod")
	private Double precio;
	
	@Column(name = "stoc_prod")
	private Integer stock;

	@OneToMany(mappedBy = "producto", cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JsonIgnoreProperties("producto")
	private Set<ProductoDetalle> detalles;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_est", foreignKey = @ForeignKey(name = "fk_estado_producto"))
	@JsonIgnoreProperties("productos")
	private Estado estado;
	
	@OneToMany(mappedBy = "producto")
	@JsonIgnoreProperties("producto")
	private Set<Compra> compras;
	
	public Producto() {
		super();
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Set<ProductoDetalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(Set<ProductoDetalle> detalles) {
		this.detalles = detalles;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	
}

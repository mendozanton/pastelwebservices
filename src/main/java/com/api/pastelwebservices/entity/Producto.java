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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prod")
	private Long idProducto;
	
	@Column(name = "nom_prod", length = 40, nullable = false)
	private String nombre;
	
	@Column(name = "des_prod", length = 80)
	private String descripcion;
	
	@Column(name = "des2_prod")
	private String descripcion2;
	
	@Column(name = "prec_prod")
	private Double precio;
	
	@Column(name = "stoc_prod")
	private Integer stock;
	
	@OneToMany(mappedBy = "producto")
	@JsonIgnoreProperties("producto")
	private Set<Imagen> imagenes;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_prod_det", foreignKey = @ForeignKey(name = "fk_detalle_producto"))
	@JsonIgnoreProperties("producto")
	private ProductoDetalle detalles;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_est", foreignKey = @ForeignKey(name = "fk_estado_producto"))
	@JsonIgnoreProperties("productos")
	private Estado estado;
	
	@ManyToMany(mappedBy = "productos",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("productos")
	private Set<Cesta> cestas;
	
	@OneToMany(mappedBy = "producto")
	@JsonIgnoreProperties("producto")
	private Set<Compra> compras;
	
	public Producto() {
		
	}

	public Producto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Set<Cesta> getCestas() {
		return cestas;
	}

	public void setCestas(Set<Cesta> cestas) {
		this.cestas = cestas;
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

	public String getDescripcion2() {
		return descripcion2;
	}

	public void setDescripcion2(String descripcion2) {
		this.descripcion2 = descripcion2;
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

	public Set<Imagen> getImagenes() {
		return imagenes;
	}

	public void setImagenes(Set<Imagen> imagenes) {
		this.imagenes = imagenes;
	}

	public ProductoDetalle getDetalles() {
		return detalles;
	}

	public void setDetalles(ProductoDetalle detalles) {
		this.detalles = detalles;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Set<Compra> getCompras() {
		return compras;
	}

	public void setCompras(Set<Compra> compras) {
		this.compras = compras;
	}


	
	
	
}

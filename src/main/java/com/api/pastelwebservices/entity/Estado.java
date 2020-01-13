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
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_est")
	private Long idEstado;
	
	@Column(name = "nom_est", length = 15)
	private String nombre;
	
	@Column(name = "des_est", length = 30)
	private String descripcion;
	
	@OneToMany(mappedBy = "estado",cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JsonIgnore
	private Set<Usuario> usuarios;
	
	@OneToMany(mappedBy = "estado",cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JsonIgnore
	private Set<Producto> productos;
	
	@OneToMany(mappedBy = "estado",cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JsonIgnore
	private Set<Pedido> pedidos;
	
	@OneToMany(mappedBy = "estado")
	@JsonIgnore
	private Set<CestaProductos> cestaProductos;
	
	@OneToMany(mappedBy = "estado")
	@JsonIgnore
	private Set<Menu> menus;
	
	
	public Estado() {
	}

	public Estado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public Set<CestaProductos> getCestaProductos() {
		return cestaProductos;
	}

	public void setCestaProductos(Set<CestaProductos> cestaProductos) {
		this.cestaProductos = cestaProductos;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
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

	public Set<Menu> getMenus() {
		return menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}
	
	
	
}

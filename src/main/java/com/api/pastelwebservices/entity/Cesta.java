package com.api.pastelwebservices.entity;

import java.util.Date;
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Cesta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cest")
	private Long idCesta;
	@Column(name = "fech_cest")
	private Date fecha;
	
	@OneToMany(mappedBy = "cesta")
	@JsonIgnore
	private Set<CestaProductos> cestaProductos;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_usu", foreignKey = @ForeignKey(name = "fk_usuario_cesta"))
	@JsonIgnore
	private Usuario usuario;

	public Cesta() {
	}

	
	public Cesta(Long idCesta) {
		this.idCesta = idCesta;
	}


	public Cesta(Date fecha, Usuario usuario) {
		this.fecha = fecha;
		this.usuario = usuario;
	}


	public Long getIdCesta() {
		return idCesta;
	}

	public void setIdCesta(Long idCesta) {
		this.idCesta = idCesta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Set<CestaProductos> getCestaProductos() {
		return cestaProductos;
	}


	public void setCestaProductos(Set<CestaProductos> cestaProductos) {
		this.cestaProductos = cestaProductos;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}

package com.api.pastelwebservices.entity;

import java.util.Date;

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
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_comp")
	private Long idCompra;
	
	@Column(name = "cod_comp", length = 20)
	private String codigo;
	
	@Column(name = "fech_comp")
	private Date fecha;
	
	@Column(name = "cant_comp")
	private Integer cantidad;
	
	@Column(name = "mont_comp")
	private Double monto;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_prod", foreignKey = @ForeignKey(name = "fk_producto_compra"))
	@JsonIgnoreProperties("compras")
	private Producto producto;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_ped", foreignKey = @ForeignKey(name = "fk_pedido_compra"))
	@JsonIgnoreProperties("compras")
	private Pedido pedido;
	
	public Compra() {
	}

	public Long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	
}

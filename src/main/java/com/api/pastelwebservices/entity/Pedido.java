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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ped")
	private Long idPedido;
	
	@Column(name = "fec_ped")
	private Date fecha;
	
	@Column(name = "envi_ped")
	private Date envio;
	
	@Column(name = "cod_ped", length = 15)
	private String codigo;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_usu", foreignKey = @ForeignKey(name = "fk_usuario_pedido"))
	@JsonIgnoreProperties("pedidos")
	private Usuario usuario;

	@OneToMany(mappedBy = "pedido")
	@JsonIgnoreProperties("pedido")
	private Set<Compra> compras;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_ped_pri", foreignKey = @ForeignKey(name = "fk_prioridad_pedido"))
	@JsonIgnoreProperties("pedidos")
	private PedidoPrioridad pedidoPrioridad;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_est", foreignKey = @ForeignKey(name = "fk_estado_pedido"))
	@JsonIgnoreProperties("pedidos")
	private Estado estado;
	
	public Pedido() {
	}

	public Set<Compra> getCompras() {
		return compras;
	}

	public void setCompras(Set<Compra> compras) {
		this.compras = compras;
	}

	public PedidoPrioridad getPedidoPrioridad() {
		return pedidoPrioridad;
	}

	public void setPedidoPrioridad(PedidoPrioridad pedidoPrioridad) {
		this.pedidoPrioridad = pedidoPrioridad;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getEnvio() {
		return envio;
	}

	public void setEnvio(Date envio) {
		this.envio = envio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}

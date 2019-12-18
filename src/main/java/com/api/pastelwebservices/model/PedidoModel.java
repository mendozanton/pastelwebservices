package com.api.pastelwebservices.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PedidoModel {
	
	private Long idPedido;
	private Date fecha;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",timezone ="America/Bogota")
	private Date envio;
	private String codigo;
	private Long usuario;
	private List<CompraModel2> compras;
	private String prioridad;
	private String estado;
	
	public PedidoModel() {
	}

	public PedidoModel(Long idPedido, Date fecha, Date envio, String codigo, Long usuario, List<CompraModel2> compras,
			String prioridad, String estado) {
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.envio = envio;
		this.codigo = codigo;
		this.usuario = usuario;
		this.compras = compras;
		this.prioridad = prioridad;
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

	public Long getUsuario() {
		return usuario;
	}

	public void setUsuario(Long usuario) {
		this.usuario = usuario;
	}

	public List<CompraModel2> getCompras() {
		return compras;
	}

	public void setCompras(List<CompraModel2> compras) {
		this.compras = compras;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}

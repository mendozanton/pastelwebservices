package com.api.pastelwebservices.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PedidoModelRegister {
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",timezone ="America/Bogota")
	private Date envio;
	private Long prioridad;
	private Long usuario;
	
	
	public PedidoModelRegister() {
	}

	public PedidoModelRegister(Date envio, Long prioridad, Long usuario) {
		this.envio = envio;
		this.prioridad = prioridad;
		this.usuario = usuario;
	}
	
	public Date getEnvio() {
		return envio;
	}

	public void setEnvio(Date envio) {
		this.envio = envio;
	}

	public Long getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Long prioridad) {
		this.prioridad = prioridad;
	}

	public Long getUsuario() {
		return usuario;
	}

	public void setUsuario(Long usuario) {
		this.usuario = usuario;
	}

	

}

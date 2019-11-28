package com.api.pastelwebservices.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Preferencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pre")
	private Long idPreferencia;
	
	@Column(name = "fech_pre")
	private Date fecha;
	
	@Column(name = "punt_pre")
	private Integer puntos;
	
	@Column(name = "come_pre")
	private String comentario;

	public Preferencia() {
	}

	public Long getIdPreferencia() {
		return idPreferencia;
	}

	public void setIdPreferencia(Long idPreferencia) {
		this.idPreferencia = idPreferencia;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	
}

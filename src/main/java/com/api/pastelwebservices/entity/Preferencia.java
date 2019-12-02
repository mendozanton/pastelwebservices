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

	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_usu", foreignKey = @ForeignKey(name = "fk_usuario_preferencia"))
	@JsonIgnoreProperties("preferencias")
	private Usuario usuario;
	
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	
}

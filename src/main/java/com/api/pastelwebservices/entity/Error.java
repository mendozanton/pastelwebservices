package com.api.pastelwebservices.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Error {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_err")
	private Long codigo;
	
	@Column(name = "cam_err", nullable = false)
	@NotNull
	private String campo;
	
	@NotNull
	@Column(name = "men_err")
	private String mensajeErr;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_mens", foreignKey = @ForeignKey(name = "fk_mensaje_error"))
	@JsonIgnoreProperties("errores")
	private Mensaje mensaje;

	public Error() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getMensajeErr() {
		return mensajeErr;
	}

	public void setMensajeErr(String mensajeErr) {
		this.mensajeErr = mensajeErr;
	}

	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}

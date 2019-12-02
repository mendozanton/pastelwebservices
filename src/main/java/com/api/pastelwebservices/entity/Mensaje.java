package com.api.pastelwebservices.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mens")
	private Long codigo;
	
	@Column(name = "men_mens", nullable = false)
	@NotNull
	private String mensaje;

	@Column(name = "err_mens")
	@OneToMany(mappedBy = "mensaje", cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JsonIgnoreProperties("mensaje")
	private List<Error> errores;

	public Mensaje() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<Error> getErrores() {
		return errores;
	}

	public void setErrores(List<Error> errores) {
		this.errores = errores;
	}
	
	
}

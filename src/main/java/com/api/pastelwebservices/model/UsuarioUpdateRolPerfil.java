package com.api.pastelwebservices.model;

public class UsuarioUpdateRolPerfil {
	private Long idUsuario;
	private Long idRol;
	private Long idPerfil;
	
	public UsuarioUpdateRolPerfil() {
	}

	public UsuarioUpdateRolPerfil(Long idUsuario, Long idRol, Long idPerfil) {
		this.idUsuario = idUsuario;
		this.idRol = idRol;
		this.idPerfil = idPerfil;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public Long getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}
	
	
	
}

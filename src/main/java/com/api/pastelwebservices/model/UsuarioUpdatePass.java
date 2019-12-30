package com.api.pastelwebservices.model;

public class UsuarioUpdatePass {
	private Long idUsuario;
	private String oldPass;
	private String newPass;
	
	
	public UsuarioUpdatePass() {
	}
	
	public UsuarioUpdatePass(Long idUsuario, String oldPass, String newPass) {
		this.idUsuario = idUsuario;
		this.oldPass = oldPass;
		this.newPass = newPass;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getOldPass() {
		return oldPass;
	}
	public void setOldPass(String oldPass) {
		this.oldPass = oldPass;
	}
	public String getNewPass() {
		return newPass;
	}
	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}
	
	
}

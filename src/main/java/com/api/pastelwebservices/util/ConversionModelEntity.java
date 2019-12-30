package com.api.pastelwebservices.util;


import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.entity.UsuarioSexo;
import com.api.pastelwebservices.model.UsuarioRegistrar;

public class ConversionModelEntity {
	public static Usuario UsuarioResgistrarToUsuario(UsuarioRegistrar usuario) {
		Usuario usuarioEntity = new Usuario();
		usuarioEntity.setNombre(usuario.getNombre());
		usuarioEntity.setApellido(usuario.getApellido());
		usuarioEntity.setNacimiento(usuario.getNacimiento());
		usuarioEntity.setTelefono(usuario.getTelefono());
		usuarioEntity.setSexo(new UsuarioSexo(new Long(usuario.getSexo())));
		usuarioEntity.setEmail(usuario.getEmail());
		usuarioEntity.setPassword(usuario.getPassword());
		
		return usuarioEntity;
	}
}

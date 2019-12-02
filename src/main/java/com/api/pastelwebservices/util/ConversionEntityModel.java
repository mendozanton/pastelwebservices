package com.api.pastelwebservices.util;

import com.api.pastelwebservices.entity.Direccion;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.model.DireccionModel;
import com.api.pastelwebservices.model.UserModel;

public class ConversionEntityModel {
	
	public static UserModel UsuarioToModel(Usuario usuario) {
		UserModel model = new UserModel();
		model.setIdUsuario(usuario.getIdUsuario());
		model.setNombre(usuario.getNombre());
		model.setApellido(usuario.getApellido());
		model.setEdad(usuario.getEdad());
		model.setEmail(usuario.getEmail());
		model.setTelefono(usuario.getTelefono());
		model.setPassword(usuario.getPassword());
		model.setSexo(usuario.getSexo().getNombre());
		model.setDireccion(DireccionToModel(usuario.getDireccion()));
		model.setRol(usuario.getRol().getNombre());
		model.setPerfil(usuario.getPerfil().getNombre());
		model.setEstado(usuario.getEstado().getNombre());
		return model;
	}
	
	public static DireccionModel DireccionToModel(Direccion direccion) {
		DireccionModel model = new DireccionModel();
		model.setIdDireccion(direccion.getIdDireccion());
		model.setAvenida(direccion.getAvenida());
		model.setUrbanizacion(direccion.getUrbanizacion());
		model.setCalle(direccion.getCalle());
		model.setSector(direccion.getSector());
		model.setManzana(direccion.getManzana());
		model.setDepartamento(direccion.getDepartamento());
		model.setLote(direccion.getLote());
		model.setCodigoPostal(direccion.getCodigoPostal());
		model.setReferencia(direccion.getReferencia());
		model.setDistrito(direccion.getDistrito().getNombre());
		return model;
	}
}

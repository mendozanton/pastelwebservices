package com.api.pastelwebservices.util;

import com.api.pastelwebservices.entity.Direccion;
import com.api.pastelwebservices.entity.Producto;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.model.DireccionModel;
import com.api.pastelwebservices.model.ProductoModel;
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
		model.setSexo(usuario.getSexo()!=null?usuario.getSexo().getNombre():null);
		model.setDireccion(usuario.getDireccion()!=null?DireccionToModel(usuario.getDireccion()):null);
		model.setRol(usuario.getRol()!=null?usuario.getRol().getNombre():null);
		model.setPerfil(usuario.getPerfil()!=null?usuario.getPerfil().getNombre():null);
		model.setEstado(usuario.getEstado()!=null?usuario.getEstado().getNombre():null);
		
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
		model.setIdDistrito(direccion.getDistrito().getIdDireccionDistrito());
		return model;
	}
	
	public static ProductoModel ProductoToModel(Producto producto) {
		ProductoModel model = new ProductoModel();
		model.setIdProducto(producto.getIdProducto());
		model.setNombre(producto.getNombre());
		model.setDescripcion(producto.getDescripcion());
		model.setPrecio(producto.getPrecio());
		model.setStock(producto.getStock());
		model.setUrlImagen(producto.getUrlImagen());
		model.setDetalles(producto.getDetalles()!=null?producto.getDetalles().getTipo():null);
		model.setEstado(producto.getEstado()!=null?producto.getEstado().getNombre():null);
		return model;
	}
}

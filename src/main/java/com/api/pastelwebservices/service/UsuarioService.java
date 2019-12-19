package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.model.DireccionModel;
import com.api.pastelwebservices.repo.UsuarioRepo;

@Service
public class UsuarioService implements ServiceCrud<Usuario>{
	
	@Autowired
	private UsuarioRepo dao;
	
	public List<Usuario> listar() {
		return dao.findAll();
	}
	
	public Usuario buscar(String email, String password) {
		boolean ema;
		Usuario usuario, usuario2; 
		
		usuario = dao.findByEmail(email);
		
		ema = (usuario == null) ? false : true;
		
		if (ema) {
			usuario2 = dao.findByEmailAndPassword(email, password);
			
			if (usuario2 != null) return usuario2;
			else return usuario;
		} 
		
		return null;
	}
	public Usuario buscar(String email) {
		return dao.findByEmail(email);
	}
	public Usuario buscar(Long id) {
		return dao.findByIdUsuario(id);
	}

	public void registrarUsuario(Usuario usuario) {
		dao.registrarUsuarioBasico(
				usuario.getEmail(), 
				usuario.getPassword());
	}
	
	
	public void guardarDireccion(Long iddireccion,DireccionModel direccion) {
		dao.registrarDireccion(direccion.getAvenida(), direccion.getCalle(), direccion.getCodigoPostal(),
				direccion.getDepartamento(), direccion.getLote(), direccion.getManzana(), direccion.getSector(), 
				direccion.getUrbanizacion(), iddireccion, direccion.getIdDistrito());
	}
	
	public void editar(Usuario usuario) {
		dao.editarUsuario(
				usuario.getNombre(), 
				usuario.getApellido(), 
				usuario.getEdad(), 
				usuario.getTelefono(), 
				usuario.getSexo().getIdUsuarioSexo(), 
				usuario.getIdUsuario()
				);
	}
	
	public void editarClienteDireccion(Long idusuario, Long iddireccion) {
		dao.actualizarClienteDireccion(iddireccion, idusuario);
	}

	@Override
	public void actualizar(Usuario object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardar(Usuario object) {
		// TODO Auto-generated method stub
		
	}
}

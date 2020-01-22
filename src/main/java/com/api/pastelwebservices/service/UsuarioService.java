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
		dao.registrarUsuario(
				usuario.getNombre(),
				usuario.getApellido(),
				usuario.getNacimiento(),
				usuario.getTelefono(),
				usuario.getSexo().getIdUsuarioSexo(),
				usuario.getEmail(), 
				usuario.getPassword(),
				usuario.getRol().getIdRol(),
				usuario.getPerfil().getIdPerfil(),
				usuario.getEstado().getIdEstado());
	}	
	
	public void guardarDireccion(Long idDireccion, DireccionModel direccion) {
		dao.registrarDireccion(direccion.getAvenida(), direccion.getCalle(), direccion.getReferencia(),
				direccion.getUrbanizacion(), idDireccion, direccion.getIdDistrito());
		dao.actualizarClienteDireccion(idDireccion, idDireccion);
	}
	
	
	public void actualizarClienteDireccion(Long idusuario, Long iddireccion) {
		dao.actualizarClienteDireccion(iddireccion, idusuario);
	}

	@Override
	public void actualizar(Usuario object) {
		// TODO Auto-generated method stub
		
	}
	public void actualizarEmail(Long idusuario, String email) {
		dao.actualizarEmailCliente(email, idusuario);
		
	}
	public void actualizarTelefono(Long idusuario, Integer telefono) {
		dao.actualizarTelefCliente(telefono, idusuario);
		
	}
	public void actualizarPass(Long idusuario, String passwd) {
		dao.actualizarPasswCliente(passwd, idusuario);
		
	}
	public void actualizarPerfilRol(Long idusuario, Long idrol,Long idperfil) {
		dao.actualizarPerfilRol(idusuario, idrol, idperfil);
		
	}
	@Override
	public void guardar(Usuario object) {
		// TODO Auto-generated method stub
		
	}
}

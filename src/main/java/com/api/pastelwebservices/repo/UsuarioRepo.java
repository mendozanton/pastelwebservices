package com.api.pastelwebservices.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
	
	public Usuario findByEmailAndPassword(String email, String password);
	public Usuario findByEmail(String email);
	public Usuario findByIdUsuario(Long idUsuario);
	
	@Procedure(procedureName = "registrarUsuario")
	public void registrarUsuario(
			@Param("nombre") String nombre,
			@Param("apellido") String apellido,
			@Param("nacimiento") Date nacimiento,
			@Param("telefono") Integer telefono,
			@Param("idsexo") Long idsexo,
			@Param("email") String email,
			@Param("passwd") String password,
			@Param("idrol") Long idrol,
			@Param("idperfil") Long idperfil,
			@Param("idestado") Long idestado);
	
	@Procedure(procedureName = "RegistrarDireccion")
	public void registrarDireccion(
			@Param("avenida") String avenida,
			@Param("calle") String calle,
			@Param("referencia") String referencia,
			@Param("urbanizacion") String urbanizacion,
			@Param("iddireccion") Long iddireccion,
			@Param("iddistrito") Long iddistrito);
	
	@Procedure(procedureName = "ActualizarClienteDireccion")
	public void actualizarClienteDireccion(
			@Param("iddireccion") Long iddireccion,
			@Param("idusuario") Long idusuario);
	
	@Procedure(procedureName = "ActualizarEmailCliente")
	public void actualizarEmailCliente(
			@Param("email") String email,
			@Param("idusuario") Long idusuario);
	
	@Procedure(procedureName = "ActualizarTelefCliente")
	public void actualizarTelefCliente(
			@Param("telefono") Integer telefono,
			@Param("idusuario") Long idusuario);
	
	@Procedure(procedureName = "ActualizarPasswCliente")
	public void actualizarPasswCliente(
			@Param("passwd") String passwd,
			@Param("idusuario") Long idusuario);
	@Procedure(procedureName = "ActualizarPerfilRol")
	public void actualizarPerfilRol(
			@Param("idusuario") Long idusuario,
			@Param("idrol") Long idrol,
			@Param("idperfil") Long idperfil);
}

package com.api.pastelwebservices.repo;

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
	
	@Procedure(procedureName = "CrearClienteBasico")
	public void registrarUsuarioBasico(
			@Param("nombre") String nombre,
			@Param("apellido") String apellido,
			@Param("email") String email,
			@Param("passwd") String password);
	
	@Procedure(procedureName = "ActualizarCliente")
	public void editarUsuario(
			@Param("nombre") String nombre,
			@Param("apellido") String apellido,
			@Param("edad") int edad,
			@Param("telefono") int telefono,
			@Param("idusario") Long idusario);
	
	@Procedure(procedureName = "CrearDireccion")
	public void registrarDireccion(
			@Param("avenida") String avenida,
			@Param("calle") String calle,
			@Param("postal") int postal,
			@Param("departamento") String departamento,
			@Param("lote") String lote,
			@Param("manzana") String manzana,
			@Param("sector") String sector,
			@Param("urbanizacion") String urbanizacion,
			@Param("iddireccion") Long iddireccion,
			@Param("iddistrito") Long iddistrito);
	
	@Procedure(procedureName = "ActualizarClienteDireccion")
	public void actualizarClienteDireccion(
			@Param("iddireccion") Long iddireccion,
			@Param("idusuario") Long idusuario);
}

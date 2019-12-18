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
	
	@Procedure(procedureName = "registrarCliente")
	public void registrarUsuarioBasico(
			@Param("email") String email,
			@Param("passwd") String password);
	
	@Procedure(procedureName = "ActualizarCliente")
	public void editarUsuario(
			@Param("nombre") String nombre,
			@Param("apellido") String apellido,
			@Param("edad") Integer edad,
			@Param("telefono") Integer telefono,
			@Param("id_sex") Long sex,
			@Param("idusario") Long idusario);
	
	@Procedure(procedureName = "RegistrarDireccion")
	public void registrarDireccion(
			@Param("avenida") String avenida,
			@Param("calle") String calle,
			@Param("postal") Integer postal,
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

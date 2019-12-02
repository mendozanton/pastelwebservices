package com.api.pastelwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
	
	public Usuario findByEmailAndPassword(String email, String password);
	public Usuario findByEmail(String email);
	public Usuario findByIdUsuario(Long idUsuario);
	@Modifying
	@Query(
			value=
			"insert into pastel.usuario("
			+ "usuario.nom_usu,usuario.ape_usu,usuario.ema_usu,usuario.pass_usu,usuario.id_rol,usuario.id_per,usuario.id_est) "
			+ "values( ?1 , ?2 , ?3, ?4 , ?5 , ?6 , ?7 ) ;" 
			,nativeQuery = true)
	public void registrarUsuarioBasico(String nombre, String apellido, String email, String password, Long idRol, Long idPer, Long idEst);
}

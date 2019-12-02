package com.api.pastelwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
	
	public Usuario findByEmailAndPassword(String email, String password);
	public Usuario findByEmail(String email);
	public Usuario findByIdUsuario(Long idUsuario);
}

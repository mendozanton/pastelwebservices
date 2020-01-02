package com.api.pastelwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.UsuarioSexo;

@Repository
public interface UsuarioSexoRepo extends JpaRepository<UsuarioSexo, Long>{
	public UsuarioSexo findByNombre(String nombre);
	
}

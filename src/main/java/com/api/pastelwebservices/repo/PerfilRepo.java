package com.api.pastelwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Perfil;

@Repository
public interface PerfilRepo extends JpaRepository<Perfil, Long>{
	
	public Perfil findByIdPerfil(Long idPerfil);
	
}

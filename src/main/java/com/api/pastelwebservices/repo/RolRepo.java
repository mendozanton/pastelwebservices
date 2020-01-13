package com.api.pastelwebservices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Perfil;
import com.api.pastelwebservices.entity.Rol;

@Repository
public interface RolRepo extends JpaRepository<Rol, Long>{
	 public Rol findByIdRolAndPerfiles(Long idRol, Perfil perfiles);
	
}

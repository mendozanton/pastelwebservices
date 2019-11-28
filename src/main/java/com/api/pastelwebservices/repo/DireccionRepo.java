package com.api.pastelwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Direccion;

@Repository
public interface DireccionRepo extends JpaRepository<Direccion, Long>{
	public Direccion findByIdDireccion(Long idDireccion);
}

package com.api.pastelwebservices.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Cesta;
import com.api.pastelwebservices.entity.Usuario;

@Repository
public interface CestaRepo extends JpaRepository<Cesta, Long>{
	public Cesta findByIdCesta(Long idCesta);
	public Cesta findByUsuario(Usuario usuario);
	
	@Procedure(procedureName = "RegistrarCesta")
	public void registrarCesta(
			@Param("fecha") Date fecha,
			@Param("idUsuario") Long idUsuario);
	
	@Procedure(procedureName = "ActualizarCesta")
	public void actualizarCesta(
			@Param("fecha") Date fecha,
			@Param("idUsuario") Long idUsuario);
}

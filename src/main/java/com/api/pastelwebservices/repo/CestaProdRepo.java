package com.api.pastelwebservices.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Cesta;
import com.api.pastelwebservices.entity.CestaProductos;

@Repository
public interface CestaProdRepo extends JpaRepository<CestaProductos, Long>{
	public CestaProductos findByIdCestaProductos(Long idCestaProductos);
	public List<CestaProductos> findByCesta(Cesta cesta);
	
	@Procedure(procedureName = "RegistrarCestaProd")
	public void registrarCestaProd(
			@Param("cantidad") Integer cantidad,
			@Param("idCesta") Long idCesta,
			@Param("idProducto") Long idProducto,
			@Param("idEstado") Long idEstado);
	
	@Procedure(procedureName = "EliminarCestaProductos")
	public void eliminarCestaProductos(
			@Param("idCestaProducto") Long idCestaProducto);
}

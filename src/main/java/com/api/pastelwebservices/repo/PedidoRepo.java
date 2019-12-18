package com.api.pastelwebservices.repo;


import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Pedido;

@Repository
public interface PedidoRepo extends JpaRepository<Pedido, Long>{
	public Pedido findByIdPedido(Long idPedido);
	public Pedido findByCodigo(String codigo);
	
	@Procedure(procedureName = "RegistarPedido")
	public void registrarPedido(
			@Param("codigo") String codigo,
			@Param("envio") Date envio,
			@Param("fecha") Date fecha,
			@Param("idEstado") Long idEstado,
			@Param("idPrioridad") Long idPrioridad,
			@Param("idUsuario") Long idUsuario);
	
}

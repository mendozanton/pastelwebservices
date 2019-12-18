package com.api.pastelwebservices.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Compra;

@Repository
public interface CompraRepo extends JpaRepository<Compra, Long>{
	
	public Compra findByIdCompra(Long idCompra);
	public Compra findByCodigo(String codigo);
	
	@Procedure(procedureName = "RegistarCompra")
	public void registrarCompra(
			@Param("cantidad") Integer cantidad,
			@Param("codigo") String codigo,
			@Param("fecha") Date fecha,
			@Param("monto") Double monto,
			@Param("idProducto") Long idProducto);
	
	@Procedure(procedureName = "AsignarPedidoACompra")
	public void asignarPedidoACompra(
			@Param("idPedido") Long idPedido,
			@Param("idCompra") Long idCompra);
}

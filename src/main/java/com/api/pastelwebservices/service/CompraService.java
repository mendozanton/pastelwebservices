package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Compra;
import com.api.pastelwebservices.repo.CompraRepo;

@Service
public class CompraService implements ServiceCrud<Compra>{
	
	@Autowired
	private CompraRepo dao;
	
	@Override
	public List<Compra> listar() {
		return dao.findAll();
	}

	@Override
	public Compra buscar(Long id) {
		return dao.findByIdCompra(id);
	}
	
	public Compra buscar(String codigo) {
		return dao.findByCodigo(codigo);
	}

	@Override
	public void actualizar(Compra object) {
		// TODO Auto-generated method stub
		
	}
	public void asignarPedidoACompra(Long idPedido, Long idCompra) {
		dao.asignarPedidoACompra(idPedido, idCompra);
		
	}
	@Override
	public void guardar(Compra object) {
		dao.registrarCompra(
				object.getCantidad(), 
				object.getCodigo(),
				object.getFecha(), 
				object.getMonto(),
				object.getProducto().getIdProducto()
				);

	}

}

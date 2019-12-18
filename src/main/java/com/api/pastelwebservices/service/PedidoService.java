package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Pedido;
import com.api.pastelwebservices.repo.PedidoRepo;

@Service
public class PedidoService implements ServiceCrud<Pedido>{
	
	@Autowired
	private PedidoRepo dao;
	
	@Override
	public List<Pedido> listar() {
		return dao.findAll();
	}

	@Override
	public Pedido buscar(Long id) {
		return dao.findByIdPedido(id);
	}
	
	public Pedido buscar(String codigo) {
		return dao.findByCodigo(codigo);
	}

	@Override
	public void guardar(Pedido object) {
		dao.registrarPedido(
				object.getCodigo(), 
				object.getEnvio(), 
				object.getFecha(),
				object.getEstado().getIdEstado(),
				object.getPedidoPrioridad().getIdPedidoPrioridad(), 
				object.getUsuario().getIdUsuario()
				);
		
	}

	@Override
	public void actualizar(Pedido object) {
		// TODO Auto-generated method stub
		
	}

}

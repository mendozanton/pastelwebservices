package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.ProductoDetalle;
import com.api.pastelwebservices.repo.ProductoDetalleRepo;

@Service
public class ProductoDetalleService implements ServiceCrud<ProductoDetalle>{
	@Autowired ProductoDetalleRepo dao;
	
	@Override
	public List<ProductoDetalle> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public ProductoDetalle buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(ProductoDetalle object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(ProductoDetalle object) {
		// TODO Auto-generated method stub
		
	}

}

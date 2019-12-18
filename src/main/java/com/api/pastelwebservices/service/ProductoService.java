package com.api.pastelwebservices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Producto;
import com.api.pastelwebservices.model.ProductoModel;
import com.api.pastelwebservices.repo.ProductoRepo;
import com.api.pastelwebservices.util.ConversionEntityModel;

@Service
public class ProductoService implements ServiceCrud<Producto>{
	
	@Autowired
	private ProductoRepo dao;
	
	public List<Producto> listarE(){
		return dao.findAll();
	}

	@Override
	public List<Producto> listar() {
		
		return dao.findAll();
	}

	@Override
	public Producto buscar(Long id) {
		return dao.findByIdProducto(id);
	}

	
	@Override
	public void actualizar(Producto object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardar(Producto object) {
		// TODO Auto-generated method stub
		
	}
	
	
}

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
public class ProductoService implements ServiceCrud<ProductoModel>{
	
	@Autowired
	private ProductoRepo dao;
	
	public List<Producto> listarE(){
		return dao.findAll();
	}

	@Override
	public List<ProductoModel> listar() {
		List<ProductoModel> model = new ArrayList<>();
		for (Producto p : dao.findAll()) {
			model.add(ConversionEntityModel.ProductoToModel(p));
		}
		return model;
	}

	@Override
	public ProductoModel buscar(Long id) {
		ProductoModel model = null;
		Producto producto = dao.findByIdProducto(id);
		
		if (producto != null) model = ConversionEntityModel.ProductoToModel(producto);
		return model;
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(ProductoModel object) {
		// TODO Auto-generated method stub
		
	}
	
	
}

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
public class ProductoService {
	@Autowired
	private ProductoRepo dao;
	
	public List<Producto> listarE(){
		return dao.findAll();
	}
	
	public List<ProductoModel> listarM() {
		List<ProductoModel> model = new ArrayList<>();
		for (Producto p : dao.findAll()) {
			model.add(ConversionEntityModel.ProductoToModel(p));
		}
		return model;
	}
}

package com.api.pastelwebservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Direccion;
import com.api.pastelwebservices.repo.DireccionRepo;

@Service
public class DireccionService {
	
	@Autowired
	private DireccionRepo dao;
	
	public Direccion buscar(Long id) {
		return dao.findByIdDireccion(id);
	}
}

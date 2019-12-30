package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.DireccionDistrito;
import com.api.pastelwebservices.repo.DistritoRepo;

@Service
public class DistritoService implements ServiceCrud<DireccionDistrito>{
	@Autowired private DistritoRepo dao;
	
	@Override
	public List<DireccionDistrito> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public DireccionDistrito buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(DireccionDistrito object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(DireccionDistrito object) {
		// TODO Auto-generated method stub
		
	}
	
}

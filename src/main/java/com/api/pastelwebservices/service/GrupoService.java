package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.pastelwebservices.entity.Grupo;
import com.api.pastelwebservices.repo.GrupoRepo;

public class GrupoService implements ServiceCrud<Grupo> {

	@Autowired GrupoRepo dao;
	
	@Override
	public List<Grupo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grupo buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Grupo object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Grupo object) {
		// TODO Auto-generated method stub
		
	}

}

package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Perfil;
import com.api.pastelwebservices.repo.PerfilRepo;

@Service
public class PerfilService implements ServiceCrud<Perfil>{

	@Autowired private PerfilRepo dao;
	
	@Override
	public List<Perfil> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Perfil buscar(Long id) {
		return dao.findByIdPerfil(id);
	}

	@Override
	public void guardar(Perfil object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Perfil object) {
		// TODO Auto-generated method stub
		
	}

}

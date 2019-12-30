package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.UsuarioSexo;
import com.api.pastelwebservices.repo.UsuarioSexoRepo;

@Service
public class UsuarioSexoService implements ServiceCrud<UsuarioSexo>{
	@Autowired private UsuarioSexoRepo dao;

	@Override
	public List<UsuarioSexo> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public UsuarioSexo buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(UsuarioSexo object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(UsuarioSexo object) {
		// TODO Auto-generated method stub
		
	}

}

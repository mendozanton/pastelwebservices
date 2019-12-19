package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Cesta;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.repo.CestaRepo;

@Service
public class CestaService implements ServiceCrud<Cesta>{
	@Autowired private CestaRepo dao;
	
	@Override
	public List<Cesta> listar() {
		return dao.findAll();
	}

	@Override
	public Cesta buscar(Long id) {
		return dao.findByIdCesta(id);
	}

	public Cesta buscarPorUsuario(Long idUsuario) {
		return dao.findByUsuario(new Usuario(idUsuario));
	}

	@Override
	public void guardar(Cesta object) {
		dao.registrarCesta(object.getFecha(), object.getUsuario().getIdUsuario());
		
	}

	@Override
	public void actualizar(Cesta object) {
		// TODO Auto-generated method stub
		
	}

}

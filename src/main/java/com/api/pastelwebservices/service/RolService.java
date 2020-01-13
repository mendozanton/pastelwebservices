package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Perfil;
import com.api.pastelwebservices.entity.Rol;
import com.api.pastelwebservices.repo.RolRepo;

@Service
public class RolService implements ServiceCrud<Rol>{
	@Autowired private RolRepo dao;
	
	@Override
	public List<Rol> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rol buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	public Rol buscarRolPerfil(Long id, Perfil perfil) {
		// TODO Auto-generated method stub
		return dao.findByIdRolAndPerfiles(id, perfil);
	}
	@Override
	public void guardar(Rol object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Rol object) {
		// TODO Auto-generated method stub
		
	}

}

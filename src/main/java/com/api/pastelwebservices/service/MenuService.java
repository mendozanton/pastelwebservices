package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Menu;
import com.api.pastelwebservices.repo.MenuRepo;

@Service
public class MenuService implements ServiceCrud<Menu>{

	@Autowired MenuRepo dao;
	
	@Override
	public List<Menu> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Menu object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Menu object) {
		// TODO Auto-generated method stub
		
	}

}

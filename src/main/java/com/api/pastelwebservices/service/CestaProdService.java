package com.api.pastelwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Cesta;
import com.api.pastelwebservices.entity.CestaProductos;
import com.api.pastelwebservices.repo.CestaProdRepo;

@Service
public class CestaProdService implements ServiceCrud<CestaProductos> {
	@Autowired private CestaProdRepo dao;

	@Override
	public List<CestaProductos> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public CestaProductos buscar(Long id) {
		// TODO Auto-generated method stub
		return dao.findByIdCestaProductos(id);
	}

	public List<CestaProductos> buscarIdCesta(Long id) {
		// TODO Auto-generated method stub
		return dao.findByCesta(new Cesta(id));
	}

	@Override
	public void guardar(CestaProductos object) {
		
		dao.registrarCestaProd(
				object.getCantidad(), 
				object.getCesta().getIdCesta(), 
				object.getProducto().getIdProducto(),
				object.getEstado().getIdEstado()
		);
		
	}

	@Override
	public void actualizar(CestaProductos object) {
		// TODO Auto-generated method stub
		
	}

}

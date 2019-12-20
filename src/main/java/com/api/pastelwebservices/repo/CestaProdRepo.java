package com.api.pastelwebservices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Cesta;
import com.api.pastelwebservices.entity.CestaProductos;

@Repository
public interface CestaProdRepo extends JpaRepository<CestaProductos, Long>{
	public CestaProductos findByIdCestaProductos(Long idCestaProductos);
	public List<CestaProductos> findByCesta(Cesta cesta);
	
}

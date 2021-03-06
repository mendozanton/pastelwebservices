package com.api.pastelwebservices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Estado;
import com.api.pastelwebservices.entity.Producto;

@Repository
public interface ProductoRepo extends JpaRepository<Producto, Long>{
	
	public Producto findByIdProducto(Long idProducto);
	public List<Producto> findByEstado(Estado estado);
	
}

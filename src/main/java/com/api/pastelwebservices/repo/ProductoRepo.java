package com.api.pastelwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Producto;

@Repository
public interface ProductoRepo extends JpaRepository<Producto, Long>{
	
}

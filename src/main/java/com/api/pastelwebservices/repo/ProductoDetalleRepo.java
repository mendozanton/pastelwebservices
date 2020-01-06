package com.api.pastelwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.ProductoDetalle;

@Repository
public interface ProductoDetalleRepo extends JpaRepository<ProductoDetalle, Long>{

}

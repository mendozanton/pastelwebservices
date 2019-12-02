package com.api.pastelwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Error;

@Repository
public interface ErrorRepo extends JpaRepository<Error, Long>{
	
	public Error findByCodigo(Long codigo);
}

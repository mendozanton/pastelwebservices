package com.api.pastelwebservices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Grupo;

@Repository
public interface GrupoRepo extends JpaRepository<Grupo, Long>{
	
	
}

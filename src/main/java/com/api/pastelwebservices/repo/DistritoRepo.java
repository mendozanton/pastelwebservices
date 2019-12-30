package com.api.pastelwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.DireccionDistrito;

@Repository
public interface DistritoRepo extends JpaRepository<DireccionDistrito, Long>{

}

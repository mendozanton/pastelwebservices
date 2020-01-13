package com.api.pastelwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Menu;

@Repository
public interface MenuRepo extends JpaRepository<Menu, Long>{
	
	
}

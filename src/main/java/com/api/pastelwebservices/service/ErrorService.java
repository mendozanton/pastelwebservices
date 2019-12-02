package com.api.pastelwebservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Error;
import com.api.pastelwebservices.repo.ErrorRepo;

@Service
public class ErrorService {

	@Autowired
	private ErrorRepo dao;
	
	public Error buscar(Long codigo) {
		return dao.findByCodigo(codigo);
	}
}

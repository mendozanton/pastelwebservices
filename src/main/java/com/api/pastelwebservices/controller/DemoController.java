package com.api.pastelwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.model.Usuario;
import com.api.pastelwebservices.repo.UsuarioRepo;


@RestController
@RequestMapping("/")
public class DemoController {
	@Autowired
	private UsuarioRepo dao;
	
	
	@GetMapping
	public List<Usuario> getUsuario() {
		return dao.findAll();
	}
}

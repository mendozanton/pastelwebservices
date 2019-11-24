package com.api.pastelwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.service.UsuarioService;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService service;
	
	
	@GetMapping
	public List<Usuario> getUsuario() {
		return service.listar();
	}
}

package com.api.pastelwebservices.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.model.UserCredential;
import com.api.pastelwebservices.service.UsuarioService;


@RestController
@RequestMapping("/api/login")
public class LoginController {
	
	@Autowired
	private UsuarioService service;
	
	@PostMapping
	public ResponseEntity<UserCredential> credenciales(@Valid @RequestBody UserCredential login) {
		UserCredential loginResponse = new UserCredential("not_found", "not_found");
		
		Usuario usuario = service.buscar(login.getEmail(), login.getPassword());
		if (usuario != null) {
			loginResponse.setEmail("found");
			
			if (usuario.getPassword().equals(login.getPassword())) {
				loginResponse.setPassword("found");
				return new ResponseEntity<>(loginResponse, HttpStatus.OK);
			}
			
		}
		return new ResponseEntity<>(loginResponse, HttpStatus.NOT_FOUND);
	}
}

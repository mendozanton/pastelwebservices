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
import com.api.pastelwebservices.service.ErrorService;
import com.api.pastelwebservices.service.MensajeService;
import com.api.pastelwebservices.service.UsuarioService;


@RestController
@RequestMapping("/api/login")
public class LoginController {
	
	@Autowired
	private UsuarioService service_usu;
	
	@Autowired
	private MensajeService service_men;
	
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> credenciales(@Valid @RequestBody UserCredential login) {
		
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();		
		Usuario usuario = service_usu.buscar(login.getEmail(), login.getPassword());
		
		if (usuario == null) {
			hashMap.put("content", service_men.buscar(new Long(1)));
		} else {
			if (usuario.getPassword().equals(login.getPassword())) {
				hashMap.put("content", service_men.buscar(new Long(2)));
			} else {
				hashMap.put("content", service_men.buscarErrorEspecifico(new Long(2)));
			}
		}
		
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
	
}

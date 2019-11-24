package com.api.pastelwebservices.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.sound.midi.MidiDevice.Info;
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
import com.api.pastelwebservices.model.InfoObj;
import com.api.pastelwebservices.model.UserCredential;
import com.api.pastelwebservices.service.UsuarioService;


@RestController
@RequestMapping("/api/login")
public class LoginController {
	
	@Autowired
	private UsuarioService service;
	
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> credenciales(@Valid @RequestBody UserCredential login) {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		UserCredential loginResponse = new UserCredential("not_found", "not_found");
		InfoObj info = new InfoObj();
		Usuario usuario = service.buscar(login.getEmail(), login.getPassword());
		
		hashMap.put("content", loginResponse);
		hashMap.put("info", info);
		
		if (usuario != null) {
			loginResponse.setEmail("found");
			
			hashMap.put("content", loginResponse);
			
			if (usuario.getPassword().equals(login.getPassword())) {
				loginResponse.setPassword("found");
				
				hashMap.put("content", loginResponse);
				return new ResponseEntity<>(hashMap, HttpStatus.OK);
			}
			
		}
		
		return new ResponseEntity<>(hashMap, HttpStatus.NOT_FOUND);
	}
}

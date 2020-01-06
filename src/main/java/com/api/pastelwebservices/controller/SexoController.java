package com.api.pastelwebservices.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.entity.UsuarioSexo;
import com.api.pastelwebservices.service.UsuarioSexoService;
import com.api.pastelwebservices.util.JsonResponseMap;

@RestController
@RequestMapping("/api/sexo")
@CrossOrigin(origins = "*")
public class SexoController {
	@Autowired private UsuarioSexoService service;
	
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getSexo() {
		
		return new ResponseEntity<>(JsonResponseMap.getHashMap(service.listar()), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> getSexoNombre(@RequestBody HashMap<String, String> object) {
		String nombre = object.get("nombre");
		UsuarioSexo sexo = service.buscar(nombre);
		
		return new ResponseEntity<>(JsonResponseMap.getHashMap(sexo), HttpStatus.OK);
	}
}

package com.api.pastelwebservices.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.entity.Estado;
import com.api.pastelwebservices.entity.Rol;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.model.InfoObj;
import com.api.pastelwebservices.model.UserRegistrar;
import com.api.pastelwebservices.service.UsuarioService;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService service;
	
	
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getUsuario() {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		InfoObj info = new InfoObj();
		List<Usuario> usuarios = service.listar();
		hashMap.put("content", usuarios);
		hashMap.put("info", info);
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<HashMap<String, Object>> getUsuarioId(@PathVariable("id") Long id) {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		InfoObj info = new InfoObj();
		Usuario usuario = service.buscar(id);
		hashMap.put("content", usuario);
		hashMap.put("info", info);
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
	
	@PostMapping(value = "/crear/cliente")
	public ResponseEntity<Usuario> saveUsuarioLogin(@Valid @RequestBody UserRegistrar newUsuario) {
	
		Usuario _usu = new Usuario(newUsuario.getNombre(),newUsuario.getApellido(),newUsuario.getEmail(),newUsuario.getPassword());
		Rol _rol = new Rol(new Long(1));
		Estado _est = new  Estado(new Long(1));
		_usu.setRol(_rol);
		_usu.setEstado(_est);
		_usu = service.guardar(_usu);
		if (_usu == null) return new ResponseEntity<>(_usu,HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<>(_usu,HttpStatus.OK);
	}
}

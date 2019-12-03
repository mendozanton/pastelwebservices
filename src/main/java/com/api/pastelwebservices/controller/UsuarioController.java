package com.api.pastelwebservices.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.entity.Direccion;
import com.api.pastelwebservices.entity.Estado;
import com.api.pastelwebservices.entity.Rol;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.model.InfoObj;
import com.api.pastelwebservices.model.UserActualizar;
import com.api.pastelwebservices.model.UserModel;
import com.api.pastelwebservices.model.UserRegistrar;
import com.api.pastelwebservices.service.DireccionService;
import com.api.pastelwebservices.service.UsuarioService;
import com.api.pastelwebservices.util.ConversionEntityModel;


@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {
	@Autowired
	private UsuarioService service;
	@Autowired
	private DireccionService service2;
	
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getUsuarios() {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		List<UserModel> usuariosModel = new ArrayList<UserModel>();
		
		for (Usuario usuario : service.listar()) {
			usuariosModel.add(ConversionEntityModel.UsuarioToModel(usuario));
		}
		
		hashMap.put("content", usuariosModel);
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<HashMap<String, Object>> getUsuarioId(@PathVariable("id") Long id) {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		Usuario usuario = service.buscar(id);
		UserModel usuariosModel = ConversionEntityModel.UsuarioToModel(usuario);
		hashMap.put("content", usuariosModel);
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
	
	@PostMapping(value = "/crear/cliente")
	public ResponseEntity<Usuario> saveUsuarioLogin(@Valid @RequestBody UserRegistrar newUsuario) {
	
		service.registrarUsuario(newUsuario.getNombre(), newUsuario.getApellido(), newUsuario.getEmail(), newUsuario.getPassword(), null, null, null);
		
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping(value = "/actualizar/cliente")
	public ResponseEntity<Usuario> updateUsuarioLogin(@Valid @RequestBody UserActualizar usu_new) {
		
		Usuario usu_bd = service.buscar(usu_new.getIdUsuario());
		usu_bd.setNombre(usu_new.getNombre());
		usu_bd.setApellido(usu_new.getApellido());
		usu_bd.setEmail(usu_new.getEmail());
		usu_bd.setEdad(usu_new.getEdad());
		usu_bd.setTelefono(usu_bd.getTelefono());
		
		Direccion dir= service2.buscar(usu_new.getIdDireccion());
		usu_bd.setDireccion(dir);
		
		Usuario _usu =service.actualizar(usu_bd);
		if (_usu == null) return new ResponseEntity<>(_usu,HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>(_usu,HttpStatus.OK);
	}
	
}

package com.api.pastelwebservices.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.api.pastelwebservices.entity.Cesta;
import com.api.pastelwebservices.entity.Mensaje;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.entity.UsuarioSexo;
import com.api.pastelwebservices.model.DireccionModel;
import com.api.pastelwebservices.model.UserActualizar;
import com.api.pastelwebservices.model.UsuarioModel;
import com.api.pastelwebservices.model.UserRegistrar;
import com.api.pastelwebservices.service.CestaService;
import com.api.pastelwebservices.service.MensajeService;
import com.api.pastelwebservices.service.UsuarioService;
import com.api.pastelwebservices.util.ConversionEntityModel;
import com.api.pastelwebservices.util.JsonResponseMap;
import com.api.pastelwebservices.util.MensajeCodigo;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {
	@Autowired
	private UsuarioService service;
	@Autowired
	private CestaService service2;
	@Autowired
	private MensajeService service_men;
	
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getUsuarios() {
		List<UsuarioModel> usuariosModel = new ArrayList<UsuarioModel>();
		for (Usuario usuario : service.listar()) {
			usuariosModel.add(ConversionEntityModel.UsuarioToModel(usuario));
		}
		return new ResponseEntity<>(JsonResponseMap.getHashMap(usuariosModel), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<HashMap<String, Object>> getUsuarioId(@PathVariable("id") Long id) {
		Usuario usuario = service.buscar(id);
		UsuarioModel usuariosModel = ConversionEntityModel.UsuarioToModel(usuario);
		return new ResponseEntity<>(JsonResponseMap.getHashMap(usuariosModel), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> crearUsuario(@Valid @RequestBody UserRegistrar usuario) {
		Mensaje mensaje;
		if (service.buscar(usuario.getEmail()) == null) {
			service.registrarUsuario(new Usuario(usuario.getEmail(), usuario.getPassword()));
			Long idUsuario = service.buscar(usuario.getEmail(), usuario.getPassword()).getIdUsuario();
			service2.guardar(new Cesta(new Date(),new Usuario(idUsuario)));
			
			mensaje = service_men.buscar(MensajeCodigo.user_created);
		} else {
			mensaje = service_men.buscar(MensajeCodigo.correo_ya_existe);
		}
		return new ResponseEntity<>(JsonResponseMap.getHashMap(mensaje),HttpStatus.OK);
	}
	
	@PostMapping(value = "/{id}/direccion")
	public ResponseEntity<HashMap<String, Object>> crearDireccion(@PathVariable("id") Long id,@Valid @RequestBody DireccionModel dir) {
		service.guardarDireccion(id,dir);
		service.editarClienteDireccion(id, dir.getIdDireccion());
		Mensaje mensaje = service_men.buscar(new Long(3));
	
		return new ResponseEntity<>(JsonResponseMap.getHashMap(mensaje),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<HashMap<String, Object>> actualizarUsuario(@Valid @RequestBody UserActualizar usu) {
		Usuario usuario = new Usuario(
				usu.getIdUsuario(),
				usu.getNombre(), 
				usu.getApellido(), 
				usu.getEdad(),
				usu.getTelefono(), 
				new UsuarioSexo(usu.getSexo()));
				
		service.editar(usuario);
		Mensaje mensaje = service_men.buscar(new Long(4));

		return new ResponseEntity<>(JsonResponseMap.getHashMap(mensaje),HttpStatus.OK);
	}
	
	
}

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
import com.api.pastelwebservices.entity.Direccion;
import com.api.pastelwebservices.entity.Mensaje;
import com.api.pastelwebservices.entity.Perfil;
import com.api.pastelwebservices.entity.Rol;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.entity.UsuarioSexo;
import com.api.pastelwebservices.model.DireccionModel;
import com.api.pastelwebservices.model.UsuarioRegistrar;
import com.api.pastelwebservices.model.UsuarioRegistrar2;
import com.api.pastelwebservices.model.UsuarioUpdateEmail;
import com.api.pastelwebservices.model.UsuarioUpdatePass;
import com.api.pastelwebservices.model.UsuarioUpdateTelef;
import com.api.pastelwebservices.model.UsuarioModel;
import com.api.pastelwebservices.model.UsuarioSexoModel;
import com.api.pastelwebservices.service.CestaService;
import com.api.pastelwebservices.service.MensajeService;
import com.api.pastelwebservices.service.UsuarioService;
import com.api.pastelwebservices.service.UsuarioSexoService;
import com.api.pastelwebservices.util.ConversionEntityModel;
import com.api.pastelwebservices.util.ConversionModelEntity;
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
	@Autowired
	private UsuarioSexoService service3;
	
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getUsuarios() {
		List<UsuarioModel> usuariosModel = new ArrayList<>();
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
	
	@GetMapping(value = "/sexo")
	public ResponseEntity<HashMap<String, Object>> getSexo() {
		
		List<UsuarioSexoModel> listSex = new ArrayList<>();
		
		for (UsuarioSexo s : service3.listar()) {
			listSex.add(new UsuarioSexoModel(s.getIdUsuarioSexo(), s.getNombre()));
		}
		return new ResponseEntity<>(JsonResponseMap.getHashMap(listSex), HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/clientedireccion")
	public ResponseEntity<HashMap<String, Object>> crearUsuarioCliente(@Valid @RequestBody UsuarioRegistrar usuario) {
		Mensaje mensaje;
		if (service.buscar(usuario.getEmail()) == null) {
			Usuario u = ConversionModelEntity.UsuarioResgistrarToUsuario(usuario);
			u.setRol(new Rol(new Long(2)));
			u.setPerfil(new Perfil(new Long(3)));
			service.registrarUsuario(u);
			Long idUsuario = service.buscar(usuario.getEmail(), usuario.getPassword()).getIdUsuario();
			
			
			service.guardarDireccion(idUsuario, usuario.getDireccion());
			
			service2.guardar(new Cesta(new Date(),new Usuario(idUsuario)));
			
			mensaje = service_men.buscar(MensajeCodigo.user_created);
		} else {
			mensaje = service_men.buscar(MensajeCodigo.correo_ya_existe);
		}
		//mensaje = service_men.buscar(MensajeCodigo.correo_ya_existe);
		return new ResponseEntity<>(JsonResponseMap.getHashMap(mensaje),HttpStatus.OK);
	}
	
	@PostMapping(value = "/cliente")
	public ResponseEntity<HashMap<String, Object>> crearUsuarioClienteSinDir(@Valid @RequestBody UsuarioRegistrar2 usuario) {
		Mensaje mensaje;
		if (service.buscar(usuario.getEmail()) == null) {
			Usuario u = ConversionModelEntity.UsuarioResgistrarToUsuario2(usuario);
			u.setRol(new Rol(new Long(2)));
			u.setPerfil(new Perfil(new Long(3)));
			service.registrarUsuario(u);
			Long idUsuario = service.buscar(usuario.getEmail(), usuario.getPassword()).getIdUsuario();

			service2.guardar(new Cesta(new Date(),new Usuario(idUsuario)));
			
			mensaje = service_men.buscar(MensajeCodigo.user_created);
		} else {
			mensaje = service_men.buscar(MensajeCodigo.correo_ya_existe);
		}
		//mensaje = service_men.buscar(MensajeCodigo.correo_ya_existe);
		return new ResponseEntity<>(JsonResponseMap.getHashMap(mensaje),HttpStatus.OK);
	}
	
	@PutMapping(value = "/email")
	public ResponseEntity<HashMap<String, Object>> actualizarEmail(@Valid @RequestBody UsuarioUpdateEmail usu) {
		service.actualizarEmail(usu.getIdUsuario(), usu.getEmail());
		Mensaje mensaje = service_men.buscar(MensajeCodigo.user_updated_email);

		return new ResponseEntity<>(JsonResponseMap.getHashMap(mensaje),HttpStatus.OK);
	}
	
	@PutMapping(value = "/telefono")
	public ResponseEntity<HashMap<String, Object>> actualizarTelefono(@Valid @RequestBody UsuarioUpdateTelef usu) {
		service.actualizarTelefono(usu.getIdUsuario(), usu.getTelefono());
		Mensaje mensaje = service_men.buscar(MensajeCodigo.user_updated_telef);

		return new ResponseEntity<>(JsonResponseMap.getHashMap(mensaje),HttpStatus.OK);
	}
	
	@PutMapping(value = "/passwd")
	public ResponseEntity<HashMap<String, Object>> actualizarPasswd(@Valid @RequestBody UsuarioUpdatePass usu) {
		String pass = service.buscar(usu.getIdUsuario()).getPassword();
		Mensaje mensaje = new Mensaje();
		
		if (pass.equals(usu.getOldPass())) {
			service.actualizarPass(usu.getIdUsuario(), usu.getNewPass());
			mensaje = service_men.buscar(MensajeCodigo.user_updated_passw);
		} else {
			mensaje = service_men.buscar(MensajeCodigo.user_passw_no_valid);
		}
		

		return new ResponseEntity<>(JsonResponseMap.getHashMap(mensaje),HttpStatus.OK);
	}
}
;
package com.api.pastelwebservices.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.entity.Mensaje;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.model.UserCredential;
import com.api.pastelwebservices.service.MensajeService;
import com.api.pastelwebservices.service.UsuarioService;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*")
public class LoginController {
	
	@Autowired
	private UsuarioService service_usu;
	
	@Autowired
	private MensajeService service_men;
	
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> credenciales(@Valid @RequestBody UserCredential login) {
		
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();		
		Usuario usuario = service_usu.buscar(login.getEmail(), login.getPassword());
		Mensaje mensaje = new Mensaje();
		if (usuario == null) {
			mensaje = service_men.buscar(new Long(1));
			hashMap.put("content", mensaje);
		} else {
			if (usuario.getPassword().equals(login.getPassword())) {
				mensaje = service_men.buscar(new Long(2));
				HashMap<String, Object> hashMap2 = new LinkedHashMap<String, Object>();
				hashMap2.put("idUsuario", usuario.getIdUsuario());
				mensaje.setData(hashMap2);
				hashMap.put("content", mensaje);
				
			} else {
				mensaje = service_men.buscarErrorEspecifico(new Long(2));
				hashMap.put("content", mensaje);
			}
		}
		
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
	
}

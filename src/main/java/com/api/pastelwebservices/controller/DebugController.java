package com.api.pastelwebservices.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.dto.CestaDto2;
import com.api.pastelwebservices.dto.PerfilDto;
import com.api.pastelwebservices.entity.Perfil;
import com.api.pastelwebservices.entity.Rol;
import com.api.pastelwebservices.service.PerfilService;
import com.api.pastelwebservices.service.RolService;
import com.api.pastelwebservices.util.ConversionEntityModel;
import com.api.pastelwebservices.util.ConversionEntityToDto;
import com.api.pastelwebservices.util.JsonResponseMap;

@RestController
@RequestMapping("/api/deb")
@CrossOrigin(origins = "*")
public class DebugController {
	@Autowired private RolService service;
	@Autowired private PerfilService service2;
	
	@GetMapping(value = "/rolper/{idrol}/{idper}")
	public ResponseEntity<HashMap<String, Object>> getRolPerfil(@PathVariable("idrol") Long idrol,
			@PathVariable("idper") Long idper) {
	
		Rol response = service.buscarRolPerfil(idrol, new Perfil(new Long(idper)));
		
		return new ResponseEntity<>(JsonResponseMap.getHashMap(response),HttpStatus.OK);
	}
	
	@GetMapping(value = "/perfil/{id}")
	public ResponseEntity<HashMap<String, Object>> getPerfil(@PathVariable("id") Long id) {
	
		PerfilDto response = ConversionEntityToDto.PerfilToDto(service2.buscar(id));
		return new ResponseEntity<>(JsonResponseMap.getHashMap(response),HttpStatus.OK);
	}
	
}

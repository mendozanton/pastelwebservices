package com.api.pastelwebservices.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.dto.RolDto;
import com.api.pastelwebservices.entity.Perfil;
import com.api.pastelwebservices.entity.Rol;
import com.api.pastelwebservices.service.RolService;
import com.api.pastelwebservices.util.JsonResponseMap;

@RestController
@RequestMapping("/api/rol")
@CrossOrigin(origins = "*")
public class RolController {
	@Autowired RolService service;
	
	@PostMapping	
	public ResponseEntity<HashMap<String, Object>> getRol(@RequestBody HashMap<String, Long> object) {
		HashMap<String, Object> response = null;
		
		Long idRol = object.get("idRol");
		
		if (idRol == 0) {
			response = JsonResponseMap.getHashMap(service.listar());
		} else if (idRol > 0) {
			response = JsonResponseMap.getHashMap(service.buscar(idRol));
		}
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping("/asocperfil")
	public ResponseEntity<HashMap<String, Object>> getRolAndPerfil(@RequestBody HashMap<String, Long> object) {
		HashMap<String, Object> response =new LinkedHashMap<String, Object>();
		HashMap<String, Object> responseAr =new LinkedHashMap<String, Object>();
		Long idRol = object.get("idRol");
		//RolDto rol = service.buscar(idRol);
		List<HashMap<String, Object>> idPerfiles= new ArrayList<>();
		for (Perfil p :  service.buscar(idRol).getPerfiles()) {
			responseAr.put("idPerfil", p.getIdPerfil());
			idPerfiles.add(responseAr);
		}
		response.put("content", idPerfiles);
		
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}

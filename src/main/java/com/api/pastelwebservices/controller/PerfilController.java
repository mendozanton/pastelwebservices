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

import com.api.pastelwebservices.dto.PerfilDto2;
import com.api.pastelwebservices.entity.Perfil;
import com.api.pastelwebservices.service.PerfilService;
import com.api.pastelwebservices.util.ConversionEntityToDto;
import com.api.pastelwebservices.util.JsonResponseMap;

@RestController
@RequestMapping("/api/perfil")
@CrossOrigin(origins = "*")
public class PerfilController {
	@Autowired PerfilService service;
	
	@PostMapping	
	public ResponseEntity<HashMap<String, Object>> getPerfil(@RequestBody HashMap<String, Long> object) {
		HashMap<String, Object> response = null;
		
		Long idPerfil = object.get("idPerfil");
		
		if (idPerfil == 0) {
			List<PerfilDto2> per = new ArrayList<>();
			for (Perfil p : service.listar()) {
				per.add(ConversionEntityToDto.PerfilToDto2(p));
			}
			response =JsonResponseMap.getHashMap(per);
		} else if (idPerfil > 0) {
			response = JsonResponseMap.getHashMap(ConversionEntityToDto.PerfilToDto2(service.buscar(idPerfil)));
		}
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}

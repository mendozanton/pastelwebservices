package com.api.pastelwebservices.controller;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.dto.CestaDto;
import com.api.pastelwebservices.entity.Cesta;
import com.api.pastelwebservices.entity.Mensaje;
import com.api.pastelwebservices.model.CestaModel;
import com.api.pastelwebservices.service.CestaService;
import com.api.pastelwebservices.service.MensajeService;
import com.api.pastelwebservices.util.ConversionEntityModel;
import com.api.pastelwebservices.util.JsonResponseMap;
import com.api.pastelwebservices.util.MensajeCodigo;

@RestController
@RequestMapping("/api/cesta")
@CrossOrigin(origins = "*")
public class CestaController {
	@Autowired private CestaService service;
	@Autowired private MensajeService service_men;
	
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getCestas() {
		
		
		List<Cesta> cestas = service.listar();
		
		return new ResponseEntity<>(JsonResponseMap.getHashMap(cestas), HttpStatus.OK);
	}
	@GetMapping(value = "/usuario={id}")
	public ResponseEntity<HashMap<String, Object>> getCestaIdUSuario(@PathVariable("id") Long id) {
		CestaModel cesta = ConversionEntityModel.CestaToModel(service.buscarPorUsuario(id));
		
		return new ResponseEntity<>(JsonResponseMap.getHashMap(cesta),HttpStatus.OK);
	}
	/*
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> registrar(@Valid @RequestBody CestaDto cesta){
		
	}*/
}

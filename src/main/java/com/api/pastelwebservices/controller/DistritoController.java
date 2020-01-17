package com.api.pastelwebservices.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

import com.api.pastelwebservices.entity.DireccionDistrito;
import com.api.pastelwebservices.entity.UsuarioSexo;
import com.api.pastelwebservices.model.DistritoModel;
import com.api.pastelwebservices.service.DistritoService;
import com.api.pastelwebservices.util.JsonResponseMap;

@RestController
@RequestMapping("/api/distrito")
@CrossOrigin(origins = "*")
public class DistritoController {
	
	@Autowired private DistritoService service;
	
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getDireciones() {
		List<DistritoModel> DistritoModel = new ArrayList<>();
		for (DireccionDistrito d : service.listar()) {
			DistritoModel.add(new DistritoModel(d.getIdDireccionDistrito(),d.getNombre()));
		}
		return new ResponseEntity<>(JsonResponseMap.getHashMap(DistritoModel), HttpStatus.OK);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<HashMap<String, Object>> getDireccionId(@PathVariable("id") Long id) {
		DireccionDistrito distrito = service.buscar(id);
		return new ResponseEntity<>(JsonResponseMap.getHashMap(distrito), HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> getDireccionId(@RequestBody HashMap<String, String> object) {
		String nombre = object.get("nombre");
		DireccionDistrito distrito = service.buscar(nombre);
		
		return new ResponseEntity<>(JsonResponseMap.getHashMap(distrito), HttpStatus.OK);
	}
}

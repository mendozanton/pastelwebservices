package com.api.pastelwebservices.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.service.MensajeService;

@RestController
@RequestMapping("/api/mensaje")
@CrossOrigin(origins = "*")
public class MensajeController {
	
	@Autowired
	private MensajeService service_men;
	
	@GetMapping
	private ResponseEntity<HashMap<String, Object>> getMensaje() {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		hashMap.put("content", service_men.listar());
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
}

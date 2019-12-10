package com.api.pastelwebservices.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.entity.Producto;
import com.api.pastelwebservices.model.ProductoModel;
import com.api.pastelwebservices.service.ProductoService;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin(origins = "*")
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@GetMapping("/all")
	public ResponseEntity<HashMap<String, Object>> getProductosEntity() {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		List<Producto> productos = service.listarE();		
		hashMap.put("content", productos);
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getProductos() {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		List<ProductoModel> productos = service.listarM();		
		hashMap.put("content", productos);
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
}

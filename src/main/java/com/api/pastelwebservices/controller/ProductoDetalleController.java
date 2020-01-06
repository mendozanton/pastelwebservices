package com.api.pastelwebservices.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.entity.ProductoDetalle;
import com.api.pastelwebservices.service.ProductoDetalleService;
import com.api.pastelwebservices.util.JsonResponseMap;

@RestController
@RequestMapping("/api/productodetalle")
@CrossOrigin(origins = "*")
public class ProductoDetalleController {
	@Autowired ProductoDetalleService service;
	
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getProductos() {
		List<ProductoDetalle> detalles = service.listar();
		return new ResponseEntity<>(JsonResponseMap.getHashMap(detalles), HttpStatus.OK);
	}
}

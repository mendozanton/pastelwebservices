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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.entity.Mensaje;
import com.api.pastelwebservices.entity.Producto;
import com.api.pastelwebservices.model.ProductoModel;
import com.api.pastelwebservices.service.MensajeService;
import com.api.pastelwebservices.service.ProductoService;
import com.api.pastelwebservices.util.ConversionEntityModel;
import com.api.pastelwebservices.util.MensajeCodigo;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin(origins = "*")
public class ProductoController {
	
	@Autowired
	private ProductoService serviceP;
	@Autowired
	private MensajeService serviceM;
	
	@GetMapping("/all")
	public ResponseEntity<HashMap<String, Object>> getProductosEntity() {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		List<Producto> productos = serviceP.listarE();		
		hashMap.put("content", productos);
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getProductos() {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		List<ProductoModel> productos = new ArrayList<>();
		for (Producto p : serviceP.listar()) {
			productos.add(ConversionEntityModel.ProductoToModel(p));
		}
		hashMap.put("content", productos);
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<HashMap<String, Object>> getProductoId(@PathVariable("id") Long id) {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		Mensaje mensaje = new Mensaje();
		
		Producto producto = serviceP.buscar(id);	
		
		if (producto == null) {
			mensaje = serviceM.buscar(MensajeCodigo.product_notfound);
			hashMap.put("content", mensaje);
		}
		else {
			hashMap.put("content", ConversionEntityModel.ProductoToModel(producto));
		}
		
		return new ResponseEntity<>(hashMap, HttpStatus.OK);
	}
}

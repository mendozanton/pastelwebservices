package com.api.pastelwebservices.controller;

import java.util.ArrayList;
import java.util.Date;
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

import com.api.pastelwebservices.dto.ProductoCompraDto;
import com.api.pastelwebservices.entity.Compra;
import com.api.pastelwebservices.entity.Mensaje;
import com.api.pastelwebservices.entity.Producto;
import com.api.pastelwebservices.model.CompraModel;
import com.api.pastelwebservices.service.CompraService;
import com.api.pastelwebservices.service.MensajeService;
import com.api.pastelwebservices.service.ProductoService;
import com.api.pastelwebservices.util.ConversionEntityModel;
import com.api.pastelwebservices.util.Generar;
import com.api.pastelwebservices.util.JsonResponseMap;
import com.api.pastelwebservices.util.MensajeCodigo;

@RestController
@RequestMapping("/api/compra")
@CrossOrigin(origins = "*")
public class CompraController {
	
	@Autowired private CompraService service;
	@Autowired private ProductoService service2;
	@Autowired private MensajeService service_men;
	
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getCompras() {
		
		List<CompraModel> compras = new ArrayList<>();
		
		for (Compra c : service.listar()) {
			compras.add(ConversionEntityModel.CompraToModel(c));
		}
		return new ResponseEntity<>(JsonResponseMap.getHashMap(compras), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<HashMap<String, Object>> getCompraId(@PathVariable("id") Long id) {
		CompraModel compra = ConversionEntityModel.CompraToModel(service.buscar(id));
		return new ResponseEntity<>(JsonResponseMap.getHashMap(compra),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> registrarCompra(@Valid @RequestBody ProductoCompraDto comp) {
		Double precio = service2.buscar(comp.getIdProducto()).getPrecio();
		Double monto = precio * comp.getCantidad();

		Compra c = new Compra();
		c.setCodigo(Generar.Codigo());
		c.setCantidad(comp.getCantidad());
		c.setFecha(new Date());
		c.setMonto(monto);
		c.setProducto(new Producto(comp.getIdProducto()));
		
		service.guardar(c);
		
		Mensaje mensaje = service_men.buscar(MensajeCodigo.compra_created);
		return new ResponseEntity<>(JsonResponseMap.getHashMap(mensaje),HttpStatus.OK);
	}
}

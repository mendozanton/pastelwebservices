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

import com.api.pastelwebservices.entity.Estado;
import com.api.pastelwebservices.entity.Mensaje;
import com.api.pastelwebservices.entity.Pedido;
import com.api.pastelwebservices.entity.PedidoPrioridad;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.model.PedidoModel;
import com.api.pastelwebservices.model.PedidoModelRegister;
import com.api.pastelwebservices.service.MensajeService;
import com.api.pastelwebservices.service.PedidoService;
import com.api.pastelwebservices.util.ConversionEntityModel;
import com.api.pastelwebservices.util.Generar;
import com.api.pastelwebservices.util.JsonResponseMap;
import com.api.pastelwebservices.util.MensajeCodigo;

@RestController
@RequestMapping("/api/pedido")
@CrossOrigin(origins = "*")
public class PedidoController {
	@Autowired private PedidoService service;
	@Autowired private MensajeService service_men;
	
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> getPedidos() {
		List<PedidoModel> pedidos = new ArrayList<>();
		for (Pedido p : service.listar()) {
			pedidos.add(ConversionEntityModel.PedidoToModel(p));
			
		}
		return new ResponseEntity<>(JsonResponseMap.getHashMap(pedidos), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<HashMap<String, Object>> getPedidoId(@PathVariable("id") Long id) {
		PedidoModel pedido = ConversionEntityModel.PedidoToModel(service.buscar(id));
		return new ResponseEntity<>(JsonResponseMap.getHashMap(pedido),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> registrarPedido(@Valid @RequestBody PedidoModelRegister ped) {
		
		service.guardar(new Pedido(
				new Date(), 
				ped.getEnvio(), 
				Generar.Codigo(), 
				new Usuario(ped.getUsuario()), 
				new PedidoPrioridad(ped.getPrioridad()), 
				new Estado(new Long(3))
		));
		
		Mensaje mensaje = service_men.buscar(MensajeCodigo.pedido_created);
		
		return new ResponseEntity<>(JsonResponseMap.getHashMap(mensaje),HttpStatus.OK);
	}
}

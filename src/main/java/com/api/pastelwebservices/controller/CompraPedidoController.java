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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.dto.CompraPedidoDto;
import com.api.pastelwebservices.dto.ProductoCompraDto;
import com.api.pastelwebservices.entity.Compra;
import com.api.pastelwebservices.entity.Estado;
import com.api.pastelwebservices.entity.Mensaje;
import com.api.pastelwebservices.entity.Pedido;
import com.api.pastelwebservices.entity.PedidoPrioridad;
import com.api.pastelwebservices.entity.Producto;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.service.CompraService;
import com.api.pastelwebservices.service.MensajeService;
import com.api.pastelwebservices.service.PedidoService;
import com.api.pastelwebservices.service.ProductoService;
import com.api.pastelwebservices.util.Generar;
import com.api.pastelwebservices.util.JsonResponseMap;
import com.api.pastelwebservices.util.MensajeCodigo;

@RestController
@RequestMapping("/api/compra_pedido")
@CrossOrigin(origins = "*")
public class CompraPedidoController {

	@Autowired private CompraService service;
	@Autowired private ProductoService service2;
	@Autowired private PedidoService service3;
	@Autowired private MensajeService service_men;
	
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> registrarCompraPedido(@Valid @RequestBody CompraPedidoDto compra) {
		List<ProductoCompraDto> Productos = compra.getProducto();
		List<String> codigosCompra = new ArrayList<>();
		
		for (int i = 0; i < Productos.size(); i++) {
			
			Double precio = service2.buscar(Productos.get(i).getIdProducto()).getPrecio();
			Double monto = precio * Productos.get(i).getCantidad();
			
			Compra c = new Compra();
			codigosCompra.add(Generar.Codigo());
			
			c.setCantidad(Productos.get(i).getCantidad());
			c.setCodigo(codigosCompra.get(i));
			c.setFecha(new Date());
			c.setMonto(monto);
			c.setProducto(new Producto(Productos.get(i).getIdProducto()));
			service.guardar(c);
		}
		
		
		Pedido p = new Pedido();
		String codigoPedido = Generar.Codigo();
		
		p.setCodigo(codigoPedido);
		p.setFecha(new Date());
		p.setEnvio(compra.getEnvio());
		p.setEstado(new Estado(new Long(3)));
		p.setPedidoPrioridad(new PedidoPrioridad(compra.getPrioridad()));
		p.setUsuario(new Usuario(compra.getUsuario()));
		service3.guardar(p);
		
		Long idPedido = service3.buscar(codigoPedido).getIdPedido();
		
		for (int i = 0; i < Productos.size(); i++) {
			Long idCompra = service.buscar(codigosCompra.get(i)).getIdCompra();
			service.asignarPedidoACompra(idPedido, idCompra);
		}
	
		Mensaje mensaje = service_men.buscar(MensajeCodigo.compra_created);
		return new ResponseEntity<>(JsonResponseMap.getHashMap(mensaje),HttpStatus.OK);
	}
		
}

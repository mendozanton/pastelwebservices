package com.api.pastelwebservices.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.api.pastelwebservices.dto.CestaDto2;
import com.api.pastelwebservices.dto.ProductoDto2;
import com.api.pastelwebservices.entity.Cesta;
import com.api.pastelwebservices.entity.CestaProductos;
import com.api.pastelwebservices.entity.Compra;
import com.api.pastelwebservices.entity.Direccion;
import com.api.pastelwebservices.entity.Grupo;
import com.api.pastelwebservices.entity.Imagen;
import com.api.pastelwebservices.entity.Menu;
import com.api.pastelwebservices.entity.Pedido;
import com.api.pastelwebservices.entity.Producto;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.model.CompraModel;
import com.api.pastelwebservices.model.CompraModel2;
import com.api.pastelwebservices.model.DireccionModel;
import com.api.pastelwebservices.model.GrupoModel;
import com.api.pastelwebservices.model.ImagenModel;
import com.api.pastelwebservices.model.MenuModel;
import com.api.pastelwebservices.model.PedidoModel;
import com.api.pastelwebservices.model.ProductoModel;
import com.api.pastelwebservices.model.UsuarioModel;

public class ConversionEntityModel {
	
	public static UsuarioModel UsuarioToModel(Usuario usuario) {
		UsuarioModel model = new UsuarioModel();
		model.setIdUsuario(usuario.getIdUsuario());
		model.setNombre(usuario.getNombre());
		model.setApellido(usuario.getApellido());
		model.setNacimiento(usuario.getNacimiento());;
		model.setEmail(usuario.getEmail());
		model.setTelefono(usuario.getTelefono());
		model.setPassword(usuario.getPassword());
		model.setSexo(usuario.getSexo()!=null?usuario.getSexo().getNombre():null);
		model.setDireccion(usuario.getDireccion()!=null?DireccionToModel(usuario.getDireccion()):null);
		model.setRol(usuario.getRol());
		model.setPerfil(usuario.getPerfil());
		model.setEstado(usuario.getEstado());
		/*
		model.setRol(usuario.getRol()!=null?usuario.getRol().getIdRol():null);
		model.setPerfil(usuario.getPerfil()!=null?usuario.getPerfil().getIdPerfil():null);
		model.setEstado(usuario.getEstado()!=null?usuario.getEstado().getIdEstado():null);
		*/
		return model;
	}
	
	public static DireccionModel DireccionToModel(Direccion direccion) {
		DireccionModel model = new DireccionModel();
		model.setAvenida(direccion.getAvenida());
		model.setCalle(direccion.getCalle());
		model.setUrbanizacion(direccion.getUrbanizacion());
		model.setReferencia(direccion.getReferencia());
		model.setIdDistrito(direccion.getDistrito().getIdDireccionDistrito());
		
		return model;
		
	}
	public static ProductoModel ProductoToModel(Producto producto) {
		ProductoModel model = new ProductoModel();
		model.setIdProducto(producto.getIdProducto());
		model.setNombre(producto.getNombre());
		model.setDescripcion(producto.getDescripcion());
		model.setDescripcion2(producto.getDescripcion2());
		model.setPrecio(producto.getPrecio());
		model.setStock(producto.getStock());
		 
		Set<Imagen> entityImg = producto.getImagenes();
		if(entityImg != null) {
			List<ImagenModel> imagenes = new ArrayList<>();
			for (Imagen i : entityImg) {
				imagenes.add(new ImagenModel(i.getIdImagen(), i.getSource(), i.getNombre()));
			}
			model.setImagenes(imagenes);
		} else { model.setImagenes(null);}
		
		model.setDetalle(producto.getDetalle()!=null?producto.getDetalle().getIdProductoDetalle():null);
		model.setEstado(producto.getEstado()!=null?producto.getEstado().getIdEstado():null);
		return model;
	}
	
	public static CompraModel CompraToModel(Compra compra) {
		CompraModel model = new CompraModel();
		model.setCantidad(compra.getCantidad());
		model.setFecha(compra.getFecha());
		model.setIdCompra(compra.getIdCompra());
		model.setMonto(compra.getMonto());
		model.setCantidad(compra.getCantidad());
		model.setPedido(compra.getPedido()!=null?compra.getPedido().getIdPedido():null);
		model.setProducto(compra.getProducto()!=null?compra.getProducto().getIdProducto():null);
		return model;
	}
	
	public static PedidoModel PedidoToModel(Pedido pedido) {
		PedidoModel model = new PedidoModel();
		model.setIdPedido(pedido.getIdPedido());
		model.setCodigo(pedido.getCodigo());
		model.setEnvio(pedido.getEnvio());
		model.setFecha(pedido.getFecha());
		model.setEstado(pedido.getEstado()!=null?pedido.getEstado().getNombre():null);
		model.setPrioridad(pedido.getPedidoPrioridad()!=null?pedido.getPedidoPrioridad().getNombre():null);
		model.setUsuario(pedido.getUsuario()!=null?pedido.getUsuario().getIdUsuario():null);
		
		Set<Compra> entityCompras = pedido.getCompras();
		if(entityCompras != null) {
			
			List<CompraModel2> compras = new ArrayList<>();
			for (Compra c : entityCompras) {
				compras.add(new CompraModel2(c.getIdCompra(), c.getCantidad(), c.getMonto(), c.getProducto().getIdProducto()));
			}
			model.setCompras(compras);
		} else { model.setCompras(null);}
		
		return model;
	}
	public static CestaDto2 CestaToModel(Cesta cesta) {
		CestaDto2 model = new CestaDto2();
		//model.setIdCesta(cesta);
		return model;
	}
	public static CestaDto2 CestaToModel2(List<CestaProductos> cesta) {
		CestaDto2 model = new CestaDto2();
		model.setIdCesta(cesta.get(0).getCesta().getIdCesta());
		model.setFecha(cesta.get(0).getCesta().getFecha());
		model.setIdUsuario(cesta.get(0).getCesta().getUsuario().getIdUsuario());
	
		List<ProductoDto2> productos = new ArrayList<>();
	    for (CestaProductos cp : cesta) {
	    	Producto p = cp.getProducto();
	    	
	    	List<ImagenModel> imagenes = new ArrayList<>();
	    	for (Imagen im : p.getImagenes()) {
				imagenes.add(new ImagenModel(
						im.getIdImagen(), 
						im.getSource(), 
						im.getNombre()));
			}
	    	productos.add(new ProductoDto2(
	    			cp.getIdCestaProductos(),
	    			p.getIdProducto(), 
	    			p.getNombre(), 
	    			p.getDescripcion(), 
	    			p.getDescripcion2(), 
	    			cp.getCantidad(), 
	    			p.getPrecio(), 
	    			p.getStock(), 
	    			imagenes, 
	    			p.getDetalle().getIdProductoDetalle(), 
	    			cp.getEstado().getIdEstado()));
		}
	    model.setProductos(productos);

		return model;
	}
	
	public static GrupoModel GrupoToModel(Grupo grupo) {
		GrupoModel model = new GrupoModel();
		model.setIdGrupo(grupo.getIdGrupo());
		model.setNombre(grupo.getNombre());
		return model;
	}
	
	public static MenuModel MenuToModel(Menu menu) {
		MenuModel model = new MenuModel();
		model.setIdMenu(menu.getIdMenu());
		model.setNombre(menu.getNombre());
		model.setIdGrupo(menu.getGrupo().getIdGrupo());
		model.setIdEstado(menu.getEstado().getIdEstado());
		model.setRuta(menu.getRuta());
		return model;
	}
}


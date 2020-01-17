package com.api.pastelwebservices.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pastelwebservices.dto.PerfilDto;
import com.api.pastelwebservices.entity.Grupo;
import com.api.pastelwebservices.entity.Mensaje;
import com.api.pastelwebservices.entity.Menu;
import com.api.pastelwebservices.entity.Rol;
import com.api.pastelwebservices.entity.Usuario;
import com.api.pastelwebservices.model.GrupoModel;
import com.api.pastelwebservices.model.MenuModel;
import com.api.pastelwebservices.service.MensajeService;
import com.api.pastelwebservices.service.PerfilService;
import com.api.pastelwebservices.service.RolService;
import com.api.pastelwebservices.service.UsuarioService;
import com.api.pastelwebservices.util.ConversionEntityModel;
import com.api.pastelwebservices.util.ConversionEntityToDto;
import com.api.pastelwebservices.util.JsonResponseMap;
import com.api.pastelwebservices.util.MensajeCodigo;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "*")
public class MenuController {
	@Autowired private RolService service;
	@Autowired private PerfilService service2;
	@Autowired private UsuarioService service3;
	@Autowired private MensajeService service4;
	
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> getMenu(@RequestBody  HashMap<String,Long> object){
		HashMap<String, Object> response =  new LinkedHashMap<String, Object>();
		
		Long idUsuario = object.get("idUsuario");
		Long opcion = object.get("opcion");
		Mensaje mensaje = new Mensaje(); 
		Usuario user = service3.buscar(idUsuario);
		Rol rol = service.buscarRolPerfil(user.getRol().getIdRol(),user.getPerfil());
		
		if (rol != null) {
			PerfilDto perfil = ConversionEntityToDto.PerfilToDto(service2.buscar(user.getPerfil().getIdPerfil()));
			if (perfil != null) {
				
				if (opcion == 1) {
					List<Grupo> grupos = new ArrayList<>();
					List<GrupoModel> grupos2 = new ArrayList<>();
					List<Menu> menus = perfil.getMenus();
					mensaje = service4.buscar(MensajeCodigo.request_succes);
					for (Menu menu : menus) { 
						grupos.add(menu.getGrupo());
					}
					// ordena los grupos por id de menor a mayor
					Collections.sort(grupos, new Comparator<Grupo>() {
	
						@Override
						public int compare(Grupo o1, Grupo o2) {
							return o1.getIdGrupo().compareTo(o2.getIdGrupo());
						}
					});
					
					Long idduplicado = new Long(0);
					for (int i = 0; i < grupos.size(); i++) {
						if (grupos.get(i).getIdGrupo() != idduplicado) {
							idduplicado = grupos.get(i).getIdGrupo();
							grupos2.add(ConversionEntityModel.GrupoToModel(grupos.get(i)));
						} 
					}
					
					response = JsonResponseMap.getHashMap(grupos2);
				}
				if (opcion == 2) {
					List<MenuModel> menus = new ArrayList<>();
					mensaje = service4.buscar(MensajeCodigo.request_succes);
					for (Menu m : perfil.getMenus()) {
						menus.add(ConversionEntityModel.MenuToModel(m));
					}
					Collections.sort(menus, new Comparator<MenuModel>() {

						@Override
						public int compare(MenuModel o1, MenuModel o2) {
							// TODO Auto-generated method stub
							return o1.getIdMenu().compareTo(o2.getIdMenu());
						}
					});
					response = JsonResponseMap.getHashMap(menus);
				}
				
			} else {
				mensaje = service4.buscar(new Long(15));
				response = JsonResponseMap.getHashMap(mensaje);
			}
		} else {
			mensaje = service4.buscar(new Long(14));
			response = JsonResponseMap.getHashMap(mensaje);
		}
		
		
		response.put("mensaje", mensaje);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}

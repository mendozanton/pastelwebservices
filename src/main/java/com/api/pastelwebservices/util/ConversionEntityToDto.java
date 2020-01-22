package com.api.pastelwebservices.util;

import java.util.ArrayList;
import java.util.List;

import com.api.pastelwebservices.dto.PerfilDto;
import com.api.pastelwebservices.dto.PerfilDto2;
import com.api.pastelwebservices.dto.RolDto;
import com.api.pastelwebservices.entity.Grupo;
import com.api.pastelwebservices.entity.Menu;
import com.api.pastelwebservices.entity.Perfil;
import com.api.pastelwebservices.entity.Rol;

public class ConversionEntityToDto {
	
	public static PerfilDto PerfilToDto(Perfil perfil) {
		PerfilDto dto = new PerfilDto();
		dto.setIdPerfil(perfil.getIdPerfil());
		dto.setDescripcion(perfil.getDescripcion());
		dto.setNombre(perfil.getNombre());
		List<Menu> menu = new ArrayList<>();
		
		for (Menu m : perfil.getMenus()) {
			menu.add(m);
		}
		dto.setMenus(menu);
		return dto;
	}
	
	public static PerfilDto2 PerfilToDto2(Perfil perfil) {
		PerfilDto2 dto = new PerfilDto2();
		dto.setIdPerfil(perfil.getIdPerfil());
		dto.setDescripcion(perfil.getDescripcion());
		dto.setNombre(perfil.getNombre());
		for (Rol r : perfil.getRoles()) {
			dto.setIdRol(r.getIdRol());
			break;
		}
		
		
		return dto;
	}
	public static RolDto RolToDto(Rol rol) {
		RolDto dto = new RolDto();
		dto.setIdRol(rol.getIdRol());
		dto.setDescripcion(rol.getDescripcion());
		dto.setNombre(rol.getNombre());
		for (Perfil p : rol.getPerfiles()) {
			//dto.setPerfiles(p);
			break;
		}
		
		
		return dto;
	}
}

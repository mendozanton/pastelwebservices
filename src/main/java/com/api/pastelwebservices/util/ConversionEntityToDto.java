package com.api.pastelwebservices.util;

import java.util.ArrayList;
import java.util.List;

import com.api.pastelwebservices.dto.PerfilDto;
import com.api.pastelwebservices.entity.Grupo;
import com.api.pastelwebservices.entity.Menu;
import com.api.pastelwebservices.entity.Perfil;

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
}

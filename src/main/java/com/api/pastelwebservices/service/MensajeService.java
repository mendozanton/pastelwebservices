package com.api.pastelwebservices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pastelwebservices.entity.Error;
import com.api.pastelwebservices.entity.Mensaje;
import com.api.pastelwebservices.repo.MensajeRepo;

@Service
public class MensajeService {
	
	@Autowired
	private MensajeRepo dao;
	
	public Mensaje buscar(Long codigo) {
		return dao.findByCodigo(codigo);
	}
	
	public List<Mensaje> listar() {
		return dao.findAll();
	}
	
	public Mensaje buscarErrorEspecifico(Long codigo) {
		Mensaje mensaje = new Mensaje();
		Error error = new Error();
		List<Error> errores = new ArrayList<>();
		
		for (Object obj[] : dao.ListarMensajeEspecifico(codigo)) {
			mensaje.setCodigo(Long.valueOf(obj[0].toString()));
			mensaje.setDescripcion(obj[1].toString());
			error.setCodigo(Long.valueOf(obj[2].toString()));
			error.setCampo(obj[3].toString());
			error.setMensajeErr(obj[4].toString());
			errores.add(error);
			mensaje.setErrores(errores);			
		}
		return mensaje;
	}
	
}


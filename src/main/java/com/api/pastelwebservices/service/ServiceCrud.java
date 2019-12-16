package com.api.pastelwebservices.service;

import java.util.List;

public interface ServiceCrud<T> {
	
	public List<T> listar();
	public T buscar(Long id);
	public void guardar();
	public void actualizar(T object);
	
}

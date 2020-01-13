package com.api.pastelwebservices.model;

public class ImagenModel {
	
	private Long idImagen;
	private String source;
	private String nombre;

	
	public ImagenModel() {
	}

	public ImagenModel(Long idImagen, String source, String nombre) {
		this.idImagen = idImagen;
		this.source = source;
		this.nombre = nombre;
	
	}

	public final Long getIdImagen() {
		return idImagen;
	}

	public final void setIdImagen(Long idImagen) {
		this.idImagen = idImagen;
	}

	public final String getSource() {
		return source;
	}

	public final void setSource(String source) {
		this.source = source;
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}


}

package com.api.pastelwebservices.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class PedidoPrioridad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ped_pri")
	private Long idPedidoPrioridad;
	
	@Column(name = "nom_ped_prid")
	private String nombre;
	
	@OneToMany(mappedBy = "pedidoPrioridad")
	@JsonIgnoreProperties("pedidoPrioridad")
	private Set<Pedido> pedidos;

	public PedidoPrioridad() {
	}

	public Long getIdPedidoPrioridad() {
		return idPedidoPrioridad;
	}

	public void setIdPedidoPrioridad(Long idPedidoPrioridad) {
		this.idPedidoPrioridad = idPedidoPrioridad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}

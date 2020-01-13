package com.api.pastelwebservices.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_men")
	private Long idMenu;
	
	@Column(name = "nom_men")
	private String nombre;
	
	@Column(name = "rut_men")
	private String ruta;

	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_est", foreignKey = @ForeignKey(name = "fk_estado_menu"))
	@JsonIgnoreProperties("menu")
	private Estado estado;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_gru", foreignKey = @ForeignKey(name = "fk_grupo_menu"))
	@JsonIgnoreProperties("menu")
	private Grupo grupo;
	
	@ManyToMany(mappedBy = "menus",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Perfil> perfiles;
	

	public Menu() {
	}

	public Menu(Long idMenu) {
		this.idMenu = idMenu;
	}

	
	public Menu(Long idMenu, String nombre, String ruta, Estado estado, Grupo grupo) {
		this.idMenu = idMenu;
		this.nombre = nombre;
		this.ruta = ruta;
		this.estado = estado;
		this.grupo = grupo;
	}

	public Long getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Set<Perfil> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(Set<Perfil> perfiles) {
		this.perfiles = perfiles;
	}
	
	
}

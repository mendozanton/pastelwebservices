package com.api.pastelwebservices.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usu")
	private Long idUsuario;
	
	@Column(name = "nom_usu",length = 30)
	private String nombre;
	
	@Column(name = "ape_usu",length = 30)
	private String apellido;
	
	@Column(name = "nac_usu")
	private Date nacimiento;
	
	@NotNull
	@Column(name = "ema_usu",length = 320, nullable = false)
	private String email;
	
	@Column(name = "tel_usu",columnDefinition = "int", length = 9, nullable = true)
	private Integer telefono;
	
	@NotNull
	@Column(name = "pass_usu",length = 18, nullable = false)
	private String password;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_sex", foreignKey = @ForeignKey(name = "fk_sexo_usuario"))
	@JsonIgnoreProperties("usuarios")
	private UsuarioSexo sexo;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_dir", foreignKey = @ForeignKey(name = "fk_direccion_usuario"))
	@JsonIgnoreProperties("usuarios")
	private Direccion direccion;
	
	@ManyToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name = "id_rol", foreignKey = @ForeignKey(name = "fk_rol_usuario"))
	@JsonIgnoreProperties("usuarios")
	private Rol rol;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_per", foreignKey = @ForeignKey(name = "fk_perfil_usuario"))
	@JsonIgnoreProperties("usuarios")
	private Perfil perfil;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JoinColumn(name = "id_est", foreignKey = @ForeignKey(name = "fk_estado_usuario"))
	@JsonIgnoreProperties("usuarios")
	private Estado estado;
	
	@OneToMany(mappedBy = "usuario",cascade = {CascadeType.MERGE, CascadeType.ALL})
	@JsonIgnoreProperties("usuario")
	private Set<Pedido> pedidos;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private Set<Preferencia> preferencias;
	
	@OneToMany(mappedBy = "usuario")
	@JsonIgnoreProperties("usuario")
	private Set<Cesta> cestas;
	
	
	
	public Usuario() {
	}


	public Usuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Usuario(String nombre, String apellido, String email, String password) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
	}

	
	public Usuario(Long idUsuario, String nombre, String apellido, Date nacimiento, @NotNull String email,
			Integer telefono, @NotNull String password, UsuarioSexo sexo, Direccion direccion, Rol rol, Perfil perfil,
			Estado estado, Set<Pedido> pedidos, Set<Preferencia> preferencias, Set<Cesta> cestas) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.email = email;
		this.telefono = telefono;
		this.password = password;
		this.sexo = sexo;
		this.direccion = direccion;
		this.rol = rol;
		this.perfil = perfil;
		this.estado = estado;
		this.pedidos = pedidos;
		this.preferencias = preferencias;
		this.cestas = cestas;
	}


	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UsuarioSexo getSexo() {
		return sexo;
	}

	public void setSexo(UsuarioSexo sexo) {
		this.sexo = sexo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Set<Preferencia> getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(Set<Preferencia> preferencias) {
		this.preferencias = preferencias;
	}

	public Set<Cesta> getCestas() {
		return cestas;
	}

	public void setCestas(Set<Cesta> cestas) {
		this.cestas = cestas;
	}

	
	
}

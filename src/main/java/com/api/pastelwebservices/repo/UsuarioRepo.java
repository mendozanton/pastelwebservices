package com.api.pastelwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.pastelwebservices.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Long>{

}

package com.api.pastelwebservices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.pastelwebservices.entity.Mensaje;

@Repository
public interface MensajeRepo extends JpaRepository<Mensaje, Long>{

	public Mensaje findByCodigo(Long Codigo);
	
	@Query(value = 
			"SELECT mensaje.id_mens,mensaje.men_mens,error.id_err,error.cam_err,error.men_err "
			+ "FROM pastel.mensaje "
			+ "inner join pastel.error "
			+ "on mensaje.id_mens = error.id_mens where error.id_err = ?1 ;", nativeQuery = true)
	public List<Object[]> ListarMensajeEspecifico(Long codigoE);
}

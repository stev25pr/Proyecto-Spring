package co.edu.ucentral.servicio.tlugares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.tlugares.model.Tlugares;


public interface TlugaresRepository extends JpaRepository<Tlugares, Long>{
	
}

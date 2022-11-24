package co.edu.ucentral.servicio.transporte.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.servicio.transporte.model.Transporte;


public interface TransporteRepository extends JpaRepository<Transporte, Long>{
	//public Optional<Transporte> deleleById(Long id);
}

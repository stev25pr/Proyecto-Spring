package co.edu.ucentral.servicio.tarifa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.tarifa.model.Tarifas;

public interface TarifaRepository extends JpaRepository<Tarifas, Long>{

}

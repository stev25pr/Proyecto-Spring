package co.edu.ucentral.servicio.tarifas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.tarifa.model.Tarifas;



public interface TarifasRepository extends JpaRepository<Tarifas, Long>{

}

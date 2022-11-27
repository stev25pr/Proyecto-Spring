package co.edu.ucentral.servicio.envio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.envio.model.Envio;



public interface EnvioRepository  extends JpaRepository<Envio, Long>{

}

package co.edu.ucentral.servicio.tcliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.tcliente.model.Tcliente;


public interface TclienteRepository extends JpaRepository<Tcliente, Long>{

}

package co.edu.ucentral.servicio.tproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.servicio.tproductos.model.Tproducto;



public interface tProductosRepository extends JpaRepository<Tproducto, Long>{
	
}

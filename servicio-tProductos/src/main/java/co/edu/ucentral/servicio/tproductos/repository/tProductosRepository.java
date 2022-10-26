package co.edu.ucentral.servicio.tproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.tproducto.model.Tproducto;


public interface tProductosRepository extends JpaRepository<Tproducto, Long>{
	
}

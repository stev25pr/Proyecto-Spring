package co.edu.ucentral.servicio.tproductos.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.tproducto.model.Tproducto;
import co.edu.ucentral.servicio.tproductos.service.tProductoService;
import steven.com.commons.services.controller.CommonController;

@RestController
public class TproductosController extends CommonController<Tproducto, tProductoService>{
	
	@PutMapping("/actualizar-precio/{id}")
	public ResponseEntity<?> actualizaPrecio(Tproducto producto, @PathVariable Long id, BindingResult result){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Tproducto> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Tproducto productoBd = optional.get();
		Double precio=productoBd.getPeso()*1000;
		productoBd.setValor(precio);
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(productoBd));
	}
	
}

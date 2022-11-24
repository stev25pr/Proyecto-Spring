package co.edu.ucentral.servicio.usuarios.controller;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.usuarios.model.Usuario;
import co.edu.ucentral.servicio.usuarios.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Long id){
		Optional<Usuario> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optional.get());
	}
	
	@GetMapping("/buscar-username")
	public ResponseEntity<?> buscarPorUsername(@RequestParam("username") String username){
		return ResponseEntity.ok().body(service.findByUsername(username));
	}
	
	
	@PostMapping
	public ResponseEntity<?> crear(@Valid @RequestBody Usuario usuario, BindingResult result, @PathVariable Long id){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		
		Usuario usuarioBd = service.save(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioBd);
		
	}

	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@Valid @RequestBody Usuario usuario, BindingResult result, @PathVariable Long id){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		
		Optional<Usuario> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Usuario usuarioBd=optional.get();
		usuarioBd.setPassword(usuario.getPassword());
		usuarioBd.setEnabled(usuario.getEnabled());
		usuarioBd.setNombre(usuario.getNombre());
		usuarioBd.setApellido(usuario.getApellido());
		usuarioBd.setEmail(usuario.getEmail());
		usuarioBd.setRoles(usuario.getRoles());
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioBd);
		
	}
	
	
	private ResponseEntity<?> validar(BindingResult result) {
		Map<String,Object> errores = new HashMap<>();
		result.getFieldErrors().forEach(err ->{
			errores.put(err.getField(), " El atributo" + err.getField()+ " "+err.getDefaultMessage());
		});
		return ResponseEntity.badRequest().body(errores);
	}
}

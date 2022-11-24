package co.edu.ucentral.servicio.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.usuarios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Usuario findByUsername(String username);
	
}

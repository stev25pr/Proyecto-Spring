package co.edu.ucentral.servicio.oauth.service;

import co.edu.ucentral.common.usuarios.model.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}

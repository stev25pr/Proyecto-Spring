package co.edu.ucentral.servicio.oauth.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.ucentral.common.usuarios.model.Usuario;



@FeignClient(name="servicio-usuarios")
public interface UsuarioFeignClient {
	
	@GetMapping("/buscar-username")
	public Usuario buscarPorUsername(@RequestParam("username") String username);
}

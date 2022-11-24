package co.edu.ucentral.servicio.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan({"co.edu.ucentral.common.usuarios.model"})
public class ServicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioUsuariosApplication.class, args);
	}

}

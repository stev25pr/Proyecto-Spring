package co.edu.ucentral.servicio.envio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"co.edu.ucentral.common.envio.model"})
public class ServicioEnvioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioEnvioApplication.class, args);
	}

}

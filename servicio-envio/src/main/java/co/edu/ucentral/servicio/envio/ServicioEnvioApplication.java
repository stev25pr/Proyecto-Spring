package co.edu.ucentral.servicio.envio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan({"co.edu.ucentral.servicio.envio.model","co.edu.ucentral.common.tproducto.model"})
@EnableEurekaClient
public class ServicioEnvioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioEnvioApplication.class, args);
	}

}

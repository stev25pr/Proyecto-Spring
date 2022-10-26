package co.edu.ucentral.servicio.tipomercancia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicioTipoMercanciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTipoMercanciaApplication.class, args);
	}

}

package co.edu.ucentral.servicio.transporte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicioTransporteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTransporteApplication.class, args);
	}

}

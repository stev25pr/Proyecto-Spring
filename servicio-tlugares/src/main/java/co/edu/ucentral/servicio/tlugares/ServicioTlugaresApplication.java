package co.edu.ucentral.servicio.tlugares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan({"co.edu.ucentral.common.tlugares.model"})
@EnableEurekaClient
public class ServicioTlugaresApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTlugaresApplication.class, args);
	}

}

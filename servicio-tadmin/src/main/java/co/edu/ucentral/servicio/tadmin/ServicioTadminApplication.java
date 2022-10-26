package co.edu.ucentral.servicio.tadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan({"co.edu.ucentral.common.tadmin.model"})
@EnableEurekaClient
public class ServicioTadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTadminApplication.class, args);
	}

}

package co.edu.ucentral.servicio.tarifas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan({"co.edu.ucentral.common.tarifa.model"})
@EnableEurekaClient
public class ServicioTarifasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTarifasApplication.class, args);
	}

}

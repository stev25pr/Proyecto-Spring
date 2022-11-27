package co.edu.ucentral.servicio.tproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan({"co.edu.ucentral.servicio.tproductos.model","co.edu.ucentral.common.envio.model","co.edu.ucentral.common.tarifa.model"})
@EnableEurekaClient
public class ServicioTProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTProductosApplication.class, args);
	}

}


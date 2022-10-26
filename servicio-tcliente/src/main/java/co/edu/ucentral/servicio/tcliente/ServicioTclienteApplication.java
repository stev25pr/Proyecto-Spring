package co.edu.ucentral.servicio.tcliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan({"co.edu.ucentral.common.tcliente.model"})
@EnableEurekaClient
public class ServicioTclienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTclienteApplication.class, args);
	}

}

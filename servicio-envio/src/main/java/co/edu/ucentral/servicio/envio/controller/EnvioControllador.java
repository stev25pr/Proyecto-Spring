package co.edu.ucentral.servicio.envio.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.envio.model.Envio;
import co.edu.ucentral.servicio.envio.service.EnvioService;
import steven.com.commons.services.controller.CommonController;

@RestController
@CrossOrigin({"http://localhost:4200"})
public class EnvioControllador extends CommonController<Envio, EnvioService> {

}

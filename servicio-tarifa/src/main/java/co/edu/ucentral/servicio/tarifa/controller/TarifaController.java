package co.edu.ucentral.servicio.tarifa.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.tarifa.model.Tarifas;
import co.edu.ucentral.servicio.tarifa.service.TarifaService;
import steven.com.commons.services.controller.CommonController;

@RestController
@CrossOrigin({"http://localhost:4200"})
public class TarifaController  extends CommonController<Tarifas, TarifaService>{

}

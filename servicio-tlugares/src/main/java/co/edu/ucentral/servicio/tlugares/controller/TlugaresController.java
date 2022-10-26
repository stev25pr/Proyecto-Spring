package co.edu.ucentral.servicio.tlugares.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.tlugares.model.Tlugares;
import co.edu.ucentral.servicio.tlugares.service.TlugaresService;
import steven.com.commons.services.controller.CommonController;

@RestController
public class TlugaresController extends CommonController<Tlugares, TlugaresService> {
	
}

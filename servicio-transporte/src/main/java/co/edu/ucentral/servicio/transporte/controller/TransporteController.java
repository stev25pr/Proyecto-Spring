package co.edu.ucentral.servicio.transporte.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.servicio.transporte.model.Transporte;
import co.edu.ucentral.servicio.transporte.service.TransporteService;
import steven.com.commons.services.controller.CommonController;

@RestController
public class TransporteController extends CommonController<Transporte, TransporteService>{

}

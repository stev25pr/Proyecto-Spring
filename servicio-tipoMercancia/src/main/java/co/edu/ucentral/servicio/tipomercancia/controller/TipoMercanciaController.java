package co.edu.ucentral.servicio.tipomercancia.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.servicio.tipomercancia.model.TipoMercancia;
import co.edu.ucentral.servicio.tipomercancia.service.TipoMercanciaService;
import steven.com.commons.services.controller.CommonController;

@RestController
public class TipoMercanciaController extends CommonController<TipoMercancia, TipoMercanciaService>{

}

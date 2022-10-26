package co.edu.ucentral.servicio.tcliente.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.tcliente.model.Tcliente;
import co.edu.ucentral.servicio.tcliente.service.TclienteService;
import steven.com.commons.services.controller.CommonController;

@RestController
public class TclienteController extends CommonController<Tcliente, TclienteService>{

}

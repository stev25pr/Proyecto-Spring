package co.edu.ucentral.servicio.tarifas.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.tarifa.model.Tarifas;
import co.edu.ucentral.servicio.tarifas.repository.TarifasRepository;
import steven.com.commons.services.service.CommonServiceImpl;

@RestController
public class TarifasController extends CommonServiceImpl<Tarifas,TarifasRepository>{

}

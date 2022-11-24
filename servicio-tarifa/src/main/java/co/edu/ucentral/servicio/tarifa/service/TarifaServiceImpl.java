package co.edu.ucentral.servicio.tarifa.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.tarifa.model.Tarifas;
import co.edu.ucentral.servicio.tarifa.repository.TarifaRepository;
import steven.com.commons.services.service.CommonServiceImpl;

@Service
public class TarifaServiceImpl  extends CommonServiceImpl<Tarifas, TarifaRepository> implements TarifaService{

}

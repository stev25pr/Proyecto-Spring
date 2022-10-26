package co.edu.ucentral.servicio.tarifas.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.tarifa.model.Tarifas;
import co.edu.ucentral.servicio.tarifas.repository.TarifasRepository;
import steven.com.commons.services.service.CommonServiceImpl;

@Service
public class TarifasServiceImpl extends CommonServiceImpl<Tarifas,TarifasRepository> implements TarifasService{

}

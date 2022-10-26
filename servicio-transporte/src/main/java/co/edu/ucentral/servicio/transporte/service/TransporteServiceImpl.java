package co.edu.ucentral.servicio.transporte.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.servicio.transporte.model.Transporte;
import co.edu.ucentral.servicio.transporte.repository.TransporteRepository;
import steven.com.commons.services.service.CommonServiceImpl;

@Service
public class TransporteServiceImpl extends CommonServiceImpl<Transporte,TransporteRepository> implements TransporteService{

}

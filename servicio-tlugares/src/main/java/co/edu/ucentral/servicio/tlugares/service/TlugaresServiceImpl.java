package co.edu.ucentral.servicio.tlugares.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.tlugares.model.Tlugares;
import co.edu.ucentral.servicio.tlugares.repository.TlugaresRepository;
import steven.com.commons.services.service.CommonServiceImpl;

@Service
public class TlugaresServiceImpl  extends CommonServiceImpl<Tlugares,TlugaresRepository> implements TlugaresService{

}

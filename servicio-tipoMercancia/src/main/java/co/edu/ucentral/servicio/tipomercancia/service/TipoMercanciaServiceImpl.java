package co.edu.ucentral.servicio.tipomercancia.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.servicio.tipomercancia.model.TipoMercancia;
import co.edu.ucentral.servicio.tipomercancia.repository.TipoMercanciaRepository;
import steven.com.commons.services.service.CommonServiceImpl;

@Service
public class TipoMercanciaServiceImpl  extends CommonServiceImpl<TipoMercancia,TipoMercanciaRepository> implements TipoMercanciaService{

}

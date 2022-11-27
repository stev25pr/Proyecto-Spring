package co.edu.ucentral.servicio.envio.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.envio.model.Envio;
import co.edu.ucentral.servicio.envio.repository.EnvioRepository;
import steven.com.commons.services.service.CommonServiceImpl;

@Service
public class EnvioServiceImpl  extends CommonServiceImpl<Envio, EnvioRepository> implements EnvioService{

}

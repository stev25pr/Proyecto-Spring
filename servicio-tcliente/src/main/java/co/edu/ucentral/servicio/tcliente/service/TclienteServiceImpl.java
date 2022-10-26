package co.edu.ucentral.servicio.tcliente.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.tcliente.model.Tcliente;
import co.edu.ucentral.servicio.tcliente.repository.TclienteRepository;
import steven.com.commons.services.service.CommonServiceImpl;

@Service
public class TclienteServiceImpl extends CommonServiceImpl<Tcliente,TclienteRepository> implements TclienteService{

}

package co.edu.ucentral.servicio.tproductos.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.servicio.tproductos.model.Tproducto;
import co.edu.ucentral.servicio.tproductos.repository.tProductosRepository;
import steven.com.commons.services.service.CommonServiceImpl;

@Service
public class tProductoServiceImpl extends CommonServiceImpl<Tproducto,tProductosRepository> implements tProductoService{

}

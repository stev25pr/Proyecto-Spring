package co.edu.ucentral.servicio.tadmin.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.tadmin.model.Tadmin;
import co.edu.ucentral.servicio.tadmin.repository.TadminRepository;
import steven.com.commons.services.service.CommonServiceImpl;

@Service
public class TadminServiceImpl extends CommonServiceImpl<Tadmin,TadminRepository> implements TadminService{

}

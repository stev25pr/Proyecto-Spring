package co.edu.ucentral.servicio.tadmin.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.tadmin.model.Tadmin;
import co.edu.ucentral.servicio.tadmin.service.TadminService;
import steven.com.commons.services.controller.CommonController;

@RestController
public class TadminController extends CommonController<Tadmin, TadminService> {

}

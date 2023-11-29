package wmscevaluacion.wmscevaluacion1.wmscControladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import wmscevaluacion.wmscevaluacion1.wmscRepositorios.WmscPublicidadRespositorio;
import wmscevaluacion.wmscevaluacion1.wmscServicios.WmscPublicacionServicio;

@RestController

public class WmscPublicacionControlador {
    @Autowired
    WmscPublicacionServicio wmscPublicacionServicio;


}

package wmscevaluacion.wmscevaluacion1.wmscServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wmscevaluacion.wmscevaluacion1.wmscModelos.WmscLibro;
import wmscevaluacion.wmscevaluacion1.wmscModelos.WmscPublicacion;
import wmscevaluacion.wmscevaluacion1.wmscRepositorios.WmscLibroRepositorio;
import wmscevaluacion.wmscevaluacion1.wmscRepositorios.WmscPublicidadRespositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Service
public class WmscPublicacionServicio {
    @Autowired
    WmscPublicidadRespositorio wmscPublicidadRespositorio;
    public void wmscAgregarPublicaciones(WmscPublicacion wmscPublicacion){
        wmscPublicidadRespositorio.wmscAgregarPublicaciones(wmscPublicacion);
    }

    public WmscPublicacion wmscBuscarPublicacion(int wmscId){

        return wmscPublicidadRespositorio.wmscBuscarPublicacion(wmscId);
    }
    public void wmscModificarPublicaciones(WmscPublicacion wmscPublicacion){
       wmscPublicidadRespositorio.wmscModificarPublicaciones(wmscPublicacion);
    }

    public void wmscEliminarPublicacion(int wmscID){
        wmscPublicidadRespositorio.wmscEliminarPublicacion(wmscID);
    }

    public int wmscCuantasPublicacionesExisten(){
        return wmscCuantasPublicacionesExisten();
    }
    //Liste los publisher que tengan libros con más de 100 hojas totales
    public List<WmscPublicacion> wmscPublicacionListMasdeCien(){
        return wmscPublicidadRespositorio.wmscPublicacionListMasdeCien();
    }

    public List<WmscPublicacion> wmscPublicacionListEmpiezanConA(){

        return wmscPublicidadRespositorio.wmscPublicacionListEmpiezanConA();
    }

    public List<WmscPublicacion> wmscPublicacionListTengaMasDeDos(){
        return wmscPublicidadRespositorio.wmscPublicacionListTengaMasDeDos();
    }
}

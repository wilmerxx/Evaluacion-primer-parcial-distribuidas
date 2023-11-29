package wmscevaluacion.wmscevaluacion1.wmscRepositorios;

import org.springframework.stereotype.Repository;
import wmscevaluacion.wmscevaluacion1.wmscModelos.WmscLibro;
import wmscevaluacion.wmscevaluacion1.wmscModelos.WmscPublicacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class WmscPublicidadRespositorio {

    List<WmscPublicacion> wmscPublicacionList = new ArrayList<>();
    WmscLibroRepositorio wmscLibros = new WmscLibroRepositorio();

    public void wmscAgregarPublicaciones(WmscPublicacion wmscPublicacion){
        if(!Objects.isNull(wmscPublicacion)){
            wmscPublicacionList.add(wmscPublicacion);
        }
    }

    public WmscPublicacion wmscBuscarPublicacion(int wmscId){
        WmscPublicacion wmscPublicacionBuscado = null;
        for (WmscPublicacion wmscPublicacion:wmscPublicacionList) {
            if(wmscId == wmscPublicacion.getWmscPublicacionID()){
                wmscPublicacionBuscado = wmscPublicacion;
            }
        }
        return wmscPublicacionBuscado;
    }
    public void wmscModificarPublicaciones(WmscPublicacion wmscPublicacion){
        WmscPublicacion wmscPublicacionBuscado = wmscBuscarPublicacion(wmscPublicacion.getWmscPublicacionID());
        if(!Objects.isNull(wmscPublicacionBuscado)){
            wmscPublicacionBuscado.setWmscNombre(wmscPublicacion.getWmscNombre());
            wmscPublicacionBuscado.setWmscPublicacionID(wmscPublicacion.getWmscPublicacionID());
        }

    }

    public void wmscEliminarPublicacion(int wmscID){
        WmscPublicacion wmscPublicacion = wmscBuscarPublicacion(wmscID);
        if(!Objects.isNull(wmscPublicacion)){
            wmscPublicacionList.remove(wmscPublicacion);
        }
    }

    public int wmscCuantasPublicacionesExisten(){
        return wmscPublicacionList.size();
    }
    //Liste los publisher que tengan libros con más de 100 hojas totales
    public List<WmscPublicacion> wmscPublicacionListMasdeCien(){
        List<WmscLibro> wmscLibroList = wmscLibros.wmscLibroListas();
        List<WmscPublicacion> wmscPublicacionResultado = new ArrayList<>();
        for (WmscPublicacion wmscPublic:wmscPublicacionList) {

        }
        return wmscPublicacionResultado;
    }

    public List<WmscPublicacion> wmscPublicacionListEmpiezanConA(){
        List<WmscPublicacion> wmscPublicacionList1 = new ArrayList<>();
        for (WmscPublicacion wmscPublic:wmscPublicacionList ) {
                if(wmscPublic.getWmscNombre().startsWith("A")){
                    wmscPublicacionList1.add(wmscPublic);
                }
        }
        return wmscPublicacionList1;
    }

    public List<WmscPublicacion> wmscPublicacionListTengaMasDeDos(){
        return wmscPublicacionList;
    }

}

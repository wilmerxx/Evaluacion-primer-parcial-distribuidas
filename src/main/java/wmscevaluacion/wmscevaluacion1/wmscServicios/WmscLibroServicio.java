package wmscevaluacion.wmscevaluacion1.wmscServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wmscevaluacion.wmscevaluacion1.wmscModelos.WmscLibro;
import wmscevaluacion.wmscevaluacion1.wmscRepositorios.WmscLibroRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Service
public class WmscLibroServicio {
    @Autowired
    private WmscLibroRepositorio wmscLibroRepositorio;
    public List<WmscLibro> wmscLibroListas(){
        return wmscLibroRepositorio.wmscLibroListas();
    }

    public void wmscAgregarLibro(WmscLibro wmscLibro){
        wmscAgregarLibro(wmscLibro);
    }

    public WmscLibro wmscBuscarLibro(String wmscIsbn){

        return wmscLibroRepositorio.wmscBuscarLibro(wmscIsbn);
    }


    public void wmscModificarLibro(WmscLibro wmscLibro){
      wmscLibroRepositorio.wmscModificarLibro(wmscLibro);
    }

    public void wmscEliminarLibro(String wmscisbn){
     wmscLibroRepositorio.wmscEliminarLibro(wmscisbn);
    }

    //Liste los libros que sean del año de publicación 2018 hasta el 2023
    public List<WmscLibro> wmscLibroListAnioPublicidad(int wmscDesde, int wmscHasta){
        return wmscLibroRepositorio.wmscLibroListAnioPublicidad(wmscDesde,wmscHasta);
    }
}

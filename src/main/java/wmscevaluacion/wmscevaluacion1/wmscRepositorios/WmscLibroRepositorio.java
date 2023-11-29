package wmscevaluacion.wmscevaluacion1.wmscRepositorios;

import org.springframework.stereotype.Repository;
import wmscevaluacion.wmscevaluacion1.wmscModelos.WmscLibro;
import wmscevaluacion.wmscevaluacion1.wmscModelos.WmscPublicacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class WmscLibroRepositorio {

    List<WmscLibro> wmscLibroListas = new ArrayList<>();
    public List<WmscLibro> wmscLibroListas(){
        return wmscLibroListas;
    }

    public void wmscAgregarLibro(WmscLibro wmscLibro){
        this.wmscLibroListas.add(wmscLibro);
    }

    public WmscLibro wmscBuscarLibro(String wmscIsbn){
        WmscLibro wmscLibroBuscado = null;
        for (WmscLibro wmscLibro:wmscLibroListas) {
            if(wmscIsbn == wmscLibro.getWmscIsbn()){
                wmscLibroBuscado = wmscLibro;
            }
        }
        return wmscLibroBuscado;
    }


    public void wmscModificarLibro(WmscLibro wmscLibro){
        WmscLibro wmscLibroBuscado = wmscBuscarLibro(wmscLibro.getWmscIsbn());
        if(!Objects.isNull(wmscLibroBuscado)){
            wmscLibroBuscado.setWmscAniosPublicacion(wmscLibro.getWmscAniosPublicacion());
            wmscLibroBuscado.setWmscTitulo(wmscLibro.getWmscTitulo());
            wmscLibroBuscado.setWmscTotalPaginas(wmscLibro.getWmscTotalPaginas());
            wmscLibroBuscado.setWmsclibroID(wmscLibro.getWmsclibroID());
            wmscLibroBuscado.setWmsclibroID(wmscLibro.getWmsclibroID());
        }

    }

    public void wmscEliminarLibro(String wmscisbn){
        WmscLibro wmscLibro = wmscBuscarLibro(wmscisbn);
        if(!Objects.isNull(wmscLibro)){
            wmscLibroListas.remove(wmscLibro);
        }
    }

    //Liste los libros que sean del año de publicación 2018 hasta el 2023
    public List<WmscLibro> wmscLibroListAnioPublicidad(int wmscDesde, int wmscHasta){
        List<WmscLibro> wmscResulado = new ArrayList<>();

        for (WmscLibro wmscLibro:wmscLibroListas) {
            if(wmscDesde>wmscHasta){
                wmscResulado.add(wmscLibro);
            }
        }
        return wmscResulado;
    }





}

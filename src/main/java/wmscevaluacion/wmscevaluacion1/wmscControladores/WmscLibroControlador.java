package wmscevaluacion.wmscevaluacion1.wmscControladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wmscevaluacion.wmscevaluacion1.wmscModelos.WmscLibro;
import wmscevaluacion.wmscevaluacion1.wmscServicios.WmscLibroServicio;

import java.util.List;
@RestController
public class WmscLibroControlador {
    @Autowired
    WmscLibroServicio wmscLibroServicio;

    @GetMapping("/wmscListaLibros")
    public ResponseEntity<?> wmscLibroListas(){
        List<WmscLibro> wmscLibroList = wmscLibroServicio.wmscLibroListas();
        if (!wmscLibroList.isEmpty()) {
            StringBuilder result = new StringBuilder();
            for (WmscLibro wmscLibro : wmscLibroList) {
                result.append(wmscLibro.toString()).append("\n");
            }
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.ok("Libro no existe");
        }
    }

    @PutMapping("/wmscAgregarLibro")
    public ResponseEntity<?> wmscAgregarLibro(
            @RequestParam(value = "wmscIsbn" ) int wmscIsbn,
            @RequestParam(value = "wmsclibroID") String wmsclibroID,
            @RequestParam(value = "wmscTitulo") String wmscTitulo,
            @RequestParam(value = "wmscTotalPaginas") int wmscTotalPaginas,
            @RequestParam(value = "wmscAniosPublicacion") int wmscAniosPublicacion
    ){
        WmscLibro wmscLibro = new WmscLibro(wmscAniosPublicacion,wmscTitulo,wmscTitulo,wmscTotalPaginas,wmscAniosPublicacion);
        wmscLibroServicio.wmscAgregarLibro(wmscLibro);
        return ResponseEntity.ok(wmscLibro);
    }


}

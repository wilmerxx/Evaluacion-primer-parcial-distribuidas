package wmscevaluacion.wmscevaluacion1.wmscModelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WmscPublicacion {
    private int wmscPublicacionID;
    private int wmscLibroID;
    private String wmscNombre;
    private List<WmscLibro> wmscLibroList;
}

package wmscevaluacion.wmscevaluacion1.wmscModelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WmscLibro {
    private int wmsclibroID;
    private String wmscIsbn;
    private String wmscTitulo;
    private int wmscTotalPaginas;
    private int wmscAniosPublicacion;

}

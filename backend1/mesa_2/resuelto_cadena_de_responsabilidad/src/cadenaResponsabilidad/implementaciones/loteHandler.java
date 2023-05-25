package cadenaResponsabilidad.implementaciones;

import cadenaResponsabilidad.AnalistaDeCalidadHandler;
import model.Articulo;

public class loteHandler extends AnalistaDeCalidadHandler {
    @Override
    protected String error(Articulo articulo) {
        return "Error al comprobar la calidad del LOTE";
    }
    @Override
    protected boolean procesarCalidadArticulo(Articulo articulo) {
        if (articulo.getLote()>=1000 && articulo.getLote()<=2000){
            return true;
        }else {
            return false;
        }
    }
}


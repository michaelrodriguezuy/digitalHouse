package cadenaResponsabilidad.implementaciones;

import cadenaResponsabilidad.AnalistaDeCalidadHandler;
import model.Articulo;

public class PesoHandler extends AnalistaDeCalidadHandler {
    @Override
    protected String error(Articulo articulo) {
        return "Error al comprobar la calidad del PESO";
    }
    @Override
    protected boolean procesarCalidadArticulo(Articulo articulo) {

        if (articulo.getPeso()>=1200 && articulo.getPeso()<=1300){
            return true;
        }else {
            return false;
        }
    }
}


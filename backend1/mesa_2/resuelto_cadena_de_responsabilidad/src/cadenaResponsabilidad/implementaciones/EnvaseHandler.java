package cadenaResponsabilidad.implementaciones;

import cadenaResponsabilidad.AnalistaDeCalidadHandler;
import model.Articulo;

public class EnvaseHandler extends AnalistaDeCalidadHandler {
    @Override
    protected String error(Articulo articulo) {
        return "Error al comprobar la calidad del ENVASE";
    }
    @Override
    protected boolean procesarCalidadArticulo(Articulo articulo) {
        if (articulo.getEnvasado().contains("sano") || articulo.getEnvasado().contains("casi sano")){

            return true;
        }else {
            return false;
        }
    }

}


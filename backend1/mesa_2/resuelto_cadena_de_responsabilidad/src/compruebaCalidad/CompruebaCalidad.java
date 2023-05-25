package compruebaCalidad;

import cadenaResponsabilidad.AnalistaDeCalidadHandler;
import cadenaResponsabilidad.implementaciones.EnvaseHandler;
import cadenaResponsabilidad.implementaciones.PesoHandler;
import cadenaResponsabilidad.implementaciones.loteHandler;
import model.Articulo;

public class CompruebaCalidad {

    private AnalistaDeCalidadHandler firstHandler;




    public CompruebaCalidad() {
        this.firstHandler = new loteHandler();
        AnalistaDeCalidadHandler secondHandler = new PesoHandler();
        AnalistaDeCalidadHandler thirdHandler = new EnvaseHandler();

        this.firstHandler.setSucessor(secondHandler);
        secondHandler.setSucessor(thirdHandler);
    }





    public void CrearArticulo(Articulo articulo){
        String mensaje = firstHandler.handleValidarCalidadDelProducto(articulo);
        System.out.println(mensaje);
    }
}


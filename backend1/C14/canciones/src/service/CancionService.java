package service;

import dao.DaoCancionH2;
import dao.IDao;
import model.Cancion;
import org.apache.log4j.Logger;

public class CancionService {

    Logger logger = Logger.getLogger(CancionService.class);

    IDao<Cancion> dao = new DaoCancionH2();

    public boolean crearUnaCanción(Cancion c){
        Cancion resultado = null;

        if(c != null) {
            resultado = dao.create(c);
        }

        return resultado != null;
    }

    public Cancion buscarUnaCancion(String id){
        Cancion resultado = null;

        if(id != null && !id.isBlank()){
            resultado = dao.findById(id);
        }else{
            logger.error("El id no es válido");
        }

        return resultado;
    }

}

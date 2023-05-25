package factory;

import clases.Reparacion;
import states.*;

public class StateFactory {
    private static StateFactory instance;

    private StateFactory(){}

    public static StateFactory getInstance(){
        if(instance == null){
            instance = new StateFactory();
        }
        return instance;
    }

    public ReparacionState changeEstado(String codigo, Reparacion reparacion) {
        switch (codigo){
            case "EnPresupuesto":
                return new EnPresupuesto(reparacion);
            case "EnReparacion":
                return new EnReparacion(reparacion);
            case "ParaEnvio":
                return new ParaEnvio(reparacion);
            case "Finalizado":
                return new Finalizado(reparacion);
            default:
                System.out.println("No pusiste el codigo correcto");
        }
        return null;
    }

}

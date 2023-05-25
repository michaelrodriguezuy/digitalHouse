package states;

import clases.Reparacion;
import factory.StateFactory;

public class ParaEnvio implements ReparacionState{

    private Reparacion reparacion;

    public ParaEnvio(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws Exception {
        if (direccion!="") {
            reparacion.setDireccion(direccion);
        }
        else {
            throw new Exception("Pasa una direccion valida");
        }
    }

    @Override
    public void valorPresupuesto(Double presupuesto) throws Exception {
        throw new Exception("NO hace nada");
    }

    @Override
    public void agregarRepuestos(Double valorRepuesto) throws Exception {
        throw new Exception("NO hace nada");
    }

    @Override
    public void siguientePaso() throws Exception {
        reparacion.setState(StateFactory.getInstance().changeEstado("Finalizado",  reparacion));
    }
}

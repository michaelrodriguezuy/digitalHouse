package states;

import clases.Reparacion;
import factory.StateFactory;

public class Finalizado implements ReparacionState{

    private Reparacion reparacion;

    public Finalizado(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws Exception {
        throw new Exception("NO hace nada");
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
        throw new Exception("Quedo pronto");
    }
}

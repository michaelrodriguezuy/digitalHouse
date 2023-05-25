package states;

import clases.Reparacion;
import factory.StateFactory;

public class EnReparacion implements ReparacionState {

    private Reparacion reparacion;

    public EnReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws Exception {
        throw new Exception("No podes cambiar la direccion en este estado");
    }

    @Override
    public void valorPresupuesto(Double presupuesto) throws Exception {
        throw new Exception("No podes cambiar el presupuesto en este estado");
    }

    @Override
    public void agregarRepuestos(Double valorRepuesto) throws Exception {
        Double presupuestoNuevo = reparacion.getPresupuesto() + valorRepuesto;
        reparacion.setPresupuesto(presupuestoNuevo);
    }

    @Override
    public void siguientePaso() throws Exception {
        System.out.println(reparacion.toString());
        reparacion.setState(StateFactory.getInstance().changeEstado("ParaEnvio", reparacion));
    }
}

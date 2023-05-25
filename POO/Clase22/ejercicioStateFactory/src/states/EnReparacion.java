package states;

import clases.Reparacion;
import factory.StateFactory;

public class EnReparacion implements ReparacionState{

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

        if (valorRepuesto>0){
            Double elNuevoPresupuesto = reparacion.getPresupuesto() + valorRepuesto;
            this.reparacion.setPresupuesto(elNuevoPresupuesto);
        }
        else {
            throw new Exception("Master tenes que poner un valor >0");
        }
        
    }

    @Override
    public void siguientePaso() throws Exception {
        reparacion.setState(StateFactory.getInstance().changeEstado("ParaEnvio",  reparacion));
    }
}

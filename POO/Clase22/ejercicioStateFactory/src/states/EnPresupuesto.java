package states;

import clases.Reparacion;
import factory.StateFactory;

public class EnPresupuesto implements ReparacionState{

    private Reparacion reparacion;

    public EnPresupuesto(Reparacion reparacion){
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws Exception {
        throw new Exception("No podes cambiar la direccion en este estado");
    }

    @Override
    public void valorPresupuesto(Double presupuesto) throws Exception {
        if(presupuesto > 0 ){
            reparacion.setPresupuesto(presupuesto);
        }else{
            throw new Exception("Master tenes que poner un presupuesto coherente");
        }
    }

    @Override
    public void agregarRepuestos(Double valorRepuesto) throws Exception {
        throw new Exception("No podes agregar repuestos en este estado");
    }

    @Override
    public void siguientePaso() throws Exception {
        reparacion.setState(StateFactory.getInstance().changeEstado("EnReparacion",reparacion));
    }
}

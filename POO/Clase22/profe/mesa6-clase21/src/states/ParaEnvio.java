package states;

import clases.Reparacion;

public class ParaEnvio implements ReparacionState{

    private Reparacion reparacion;

    public ParaEnvio(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws Exception {
        reparacion.setDireccion(direccion);
    }

    @Override
    public void valorPresupuesto(Double presupuesto) throws Exception {
        throw new Exception("No podes cambiar el presupuesto en este estado");
    }

    @Override
    public void agregarRepuestos(Double valorRepuesto) throws Exception {
        throw new Exception("No podes cambiar la direccion en este estado");
    }

    @Override
    public void siguientePaso() throws Exception {
        System.out.println(reparacion.toString());
        reparacion.setState(new Finalizado(reparacion));
    }
}

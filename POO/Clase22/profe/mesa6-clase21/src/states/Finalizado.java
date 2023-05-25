package states;

import clases.Reparacion;

public class Finalizado implements ReparacionState{

    private Reparacion reparacion;

    public Finalizado(Reparacion reparacion) {
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
        throw new Exception("No podes agregar repuestos en este estado");
    }

    @Override
    public void siguientePaso() throws Exception {
        System.out.println(reparacion.toString());
        throw new Exception("No existe un siguiente paso en este estado");
    }
}

package clases;

import factory.StateFactory;
import states.ReparacionState;

public class Reparacion {
    private String articulo;
    private Double presupuesto;
    private String direccion;
    private ReparacionState state;

    public Reparacion(String articulo) {
        this.articulo = articulo;
        this.presupuesto = 0.0;
        this.state = StateFactory.getInstance().changeEstado("EnPresupuesto",this);
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setState(ReparacionState state) {
        this.state = state;
    }

    public void cambiarDireccion(String direccion) throws Exception{
        this.state.cambiarDireccion(direccion);
    }
    public void valorPresupuesto(Double presupuesto) throws Exception{
        this.state.valorPresupuesto(presupuesto);
    }
    public void agregarRepuestos(Double valorRepuesto) throws Exception{
        this.state.agregarRepuestos(valorRepuesto);
    }
    public void siguientePaso() throws Exception{
        this.state.siguientePaso();
    }

    @Override
    public String toString() {
        return "Reparacion{" +
                "articulo='" + articulo + '\'' +
                ", presupuesto=" + presupuesto +
                ", direccion='" + direccion + '\'' +
                ", state=" + state +
                '}';
    }
}

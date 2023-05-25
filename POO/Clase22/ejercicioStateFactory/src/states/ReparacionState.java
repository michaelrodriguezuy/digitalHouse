package states;

public interface ReparacionState {
    void cambiarDireccion(String direccion) throws Exception;
    void valorPresupuesto(Double presupuesto) throws Exception;
    void agregarRepuestos(Double valorRepuesto) throws Exception;
    void siguientePaso() throws Exception;
}

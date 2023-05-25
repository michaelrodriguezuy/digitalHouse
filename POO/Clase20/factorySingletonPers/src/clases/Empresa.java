package clases;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    List<Empleado> empleadoList;

    public Empresa(String nombre){
        this.nombre = nombre;
        this.empleadoList = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        this.empleadoList.add(empleado);
    }

    public Double calcularSueldosTotal(Integer dias){
        double sueldoTotal = 0;
        for (Empleado empleado: empleadoList){
            sueldoTotal += empleado.calcularSueldo(dias);
        }
        return sueldoTotal;
    }

}

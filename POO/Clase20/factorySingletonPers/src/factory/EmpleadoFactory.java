package factory;

import clases.Empleado;
import clases.EmpleadoContratado;
import clases.EmpleadoRelacionDependencia;

public class EmpleadoFactory {
    private static EmpleadoFactory instance;
    public static final String CODIGO_EMPLEADO_RD = "EMP-RD";
    private EmpleadoFactory(){};

    public static EmpleadoFactory getInstance(){
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado generarEmpleado(String codigo){
        switch (codigo){
            case "EMP-RD":
                return new EmpleadoRelacionDependencia(null,null,null,1000.0);
            case "EMP-PH":
                return new EmpleadoContratado(null,null,null,7.0,14.0);
        }
        return null;
    }
}

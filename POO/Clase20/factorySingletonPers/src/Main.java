import clases.Empleado;
import clases.EmpleadoContratado;
import clases.Empresa;
import factory.EmpleadoFactory;

public class Main {
    public static void main(String[] args) {

        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();
        EmpleadoFactory empleadoFactory1 = EmpleadoFactory.getInstance();
        System.out.println(empleadoFactory);
        System.out.println(empleadoFactory1);

        //empleadoFactory.generarEmpleado("EMP-PH");
        Empresa empresa = new Empresa("TheBest");
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_RD)); // de esta forma le pido a la clase el codigo
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-RD"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-RD"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-PH"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-PH"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-PH"));

        System.out.println("El gasto total en sueldo es de: " + empresa.calcularSueldosTotal(28));

    }
}
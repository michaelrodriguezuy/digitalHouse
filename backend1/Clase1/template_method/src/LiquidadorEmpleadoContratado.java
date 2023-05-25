public class LiquidadorEmpleadoContratado extends Liquidador{
    @Override
    protected int calcularElSueldo(Empleado e) {
        int sueldo = 0;

        if(e instanceof EmpleadoContratado){
            EmpleadoContratado ec = (EmpleadoContratado) e;

            sueldo = ec.getHorasTrabajadas() * ec.getValorPorHora();
        }

        return sueldo;
    }

    @Override
    protected void notificar(Empleado e, int sueldo) {
        System.out.println("Email enviado al empleado " + e.getNombre() + ": El sueldo es de " + sueldo);
    }
}

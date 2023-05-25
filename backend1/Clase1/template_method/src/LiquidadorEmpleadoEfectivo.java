public class LiquidadorEmpleadoEfectivo extends Liquidador{
    @Override
    protected int calcularElSueldo(Empleado e) {
        int sueldo = 0;

        if(e instanceof EmpleadoEfectivo){
            EmpleadoEfectivo ef = (EmpleadoEfectivo) e;

            sueldo = ef.getSueldoBase() + ef.getBonos() - ef.getDescuentos();
        }

        return sueldo;
    }

    @Override
    protected void notificar(Empleado e, int sueldo) {
        System.out.println("Recibo impreso para el empleado " + e.getNombre() + ": El sueldo es de " + sueldo);
    }
}

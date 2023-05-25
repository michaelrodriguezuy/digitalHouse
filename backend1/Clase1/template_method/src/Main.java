public class Main {
    public static void main(String[] args) {

        Empleado e = new EmpleadoEfectivo("Yuma", "Baby", "abc123", 10, 30, 20);
        Empleado e2 = new EmpleadoContratado("Nero", "Neroso", "abc234", 10, 6);

        Liquidador liquidador = new LiquidadorEmpleadoEfectivo();

        liquidador.pagarNomina(e2);
    }
}
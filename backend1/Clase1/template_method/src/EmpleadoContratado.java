public class EmpleadoContratado extends Empleado{

    private int horasTrabajadas;
    private int valorPorHora;

    public EmpleadoContratado(String nombre, String apellido, String numeroDeCuenta, int horasTrabajadas, int valorPorHora) {
        super(nombre, apellido, numeroDeCuenta);
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}

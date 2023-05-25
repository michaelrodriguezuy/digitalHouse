package clases;

public class EmpleadoContratado extends Empleado{
    private Double importePorHora;
    private Double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, Integer legajo, Double importePorHora, Double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public Double calcularSueldo(Integer dias) {
        double sueldoTotal = (importePorHora * 8 * dias);
        return sueldoTotal - (sueldoTotal * retencionImpuesto / 100);
    }
}

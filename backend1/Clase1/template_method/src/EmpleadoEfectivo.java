public class EmpleadoEfectivo extends Empleado{

    private int sueldoBase;
    private int bonos;
    private int descuentos;

    public EmpleadoEfectivo(String nombre, String apellido, String numeroDeCuenta, int sueldoBase) {
        super(nombre, apellido, numeroDeCuenta);
        this.sueldoBase = sueldoBase;
    }

    public EmpleadoEfectivo(String nombre, String ap, String numeroDeCuenta, int sueldoBase, int bonos, int descuentos) {
        this(nombre, ap, numeroDeCuenta, sueldoBase);
        this.bonos = bonos;
        this.sueldoBase = sueldoBase;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getBonos() {
        return bonos;
    }

    public void setBonos(int bonos) {
        this.bonos = bonos;
    }

    public int getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(int descuentos) {
        this.descuentos = descuentos;
    }
}

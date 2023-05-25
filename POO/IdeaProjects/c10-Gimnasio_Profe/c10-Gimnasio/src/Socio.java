public class Socio {
    private Integer nroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;


    public Socio(Integer nroSocio, String nombre, Double cuotaMensual, String actividad){
        this.nroSocio = nroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public Double calcularCostoMensual(){
        return this.cuotaMensual;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nroSocio=" + nroSocio +
                ", nombre='" + nombre + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                ", actividad='" + actividad + '\'' +
                '}';
    }
}

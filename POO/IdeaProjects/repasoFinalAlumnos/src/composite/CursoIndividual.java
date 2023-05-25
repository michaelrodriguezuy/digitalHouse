package composite;

public class CursoIndividual implements Curso, Comparable{
    private String nombre, descripcion;
    private Double cargaHoraria, duracion, valorHora;

    public CursoIndividual(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularPrecio(){
        return (cargaHoraria * duracion * valorHora);
    }

    @Override
    public String toString() {
        return "CursoIndividual{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio total=" + calcularPrecio() +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

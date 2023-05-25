package composite;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo implements Curso{
    private String nombre, descripcion;
    private Double bonificacion;
    private List<Curso> cursos;

    public ProgramaIntensivo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cursos = new ArrayList<>();
    }

    public void setBonificacion(Double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }

    @Override
    public Double calcularPrecio() {
        double precioTotal = 0.0;
        for(Curso curso:cursos){
            precioTotal += curso.calcularPrecio();
        }
        return (precioTotal - (precioTotal * bonificacion / 100));
    }

    @Override
    public String toString() {
        return "ProgramaIntensivo{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", bonificacion=" + bonificacion +
                ", Precio con descuento=" + calcularPrecio() +
                ", cursos=" + cursos +
                '}';
    }
}

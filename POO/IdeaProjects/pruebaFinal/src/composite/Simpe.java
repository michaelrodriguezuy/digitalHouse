package composite;

public class Simpe implements Pizza{
    private String nombre, descripcion;
    private Double precioBase;
    private Boolean especial=false;

    public Simpe(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }
    public void setEspecial(Boolean especial) {
        this.especial = especial;
    }

    public Double calcularPrecio() {
        if (especial) {
            return precioBase * 1.7;
        }
        return precioBase;
    }


    @Override
    public String toString() {
        return "Simpe{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioBase=" + calcularPrecio() +
                ", especial=" + especial +
                '}';
    }


}

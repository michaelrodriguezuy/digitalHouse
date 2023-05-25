public class Socio {
    private String nombre;
    private Integer edad;

    public Socio(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

package camada12.pruebaspringboot.model;

public class Jugador {
    private String nombre;
    private int numeroCamiseta;

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public Jugador(String nombre, int numeroCamiseta) {
        this.nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
    }
}

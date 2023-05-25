package composite;

public class ProductoIndividual implements Producto{
    private String nombre;
    private Double precio;

    public ProductoIndividual(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Double costo() {
        return precio;
    }
}

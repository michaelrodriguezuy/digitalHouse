package composite;

import java.util.List;

public class Combo implements Producto{
    private String nombre;
    private Double descuento;
    private List<Producto> productos;

    public Combo(String nombre, Double descuento, List<Producto> productos) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.productos = productos;
    }

    @Override
    public Double costo() {
        Double precioTotal = 0.0;
        for(Producto producto: productos){
            precioTotal += producto.costo();
        }
        return (precioTotal - (precioTotal * descuento /100));
    }
}

package clases;

import composite.Producto;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public Double precioTotal(){
        Double precioTotal = 0.0;
        for (Producto producto:productos){
            precioTotal += producto.costo();
        }
        return precioTotal;
    }



}

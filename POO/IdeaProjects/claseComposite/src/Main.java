import clases.Carrito;
import composite.Combo;
import composite.Producto;
import composite.ProductoIndividual;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Carrito carrito = new Carrito();
        Producto hamburguesa = new ProductoIndividual("Big Mac", 350.0);
        Producto papasChicas = new ProductoIndividual("Papas Chicas", 175.0);
        Producto papasGrandes = new ProductoIndividual("Papas Grandes", 200.0);
        Producto gaseosa = new ProductoIndividual("Gaseaosa", 75.5);

        List<Producto> productosDelCombo = new ArrayList<>();
        productosDelCombo.add(hamburguesa);
        productosDelCombo.add(papasGrandes);
        productosDelCombo.add(gaseosa);

        Producto combo = new Combo("Combo Big Mac", 15.0,productosDelCombo);

        carrito.agregarProducto(combo);
        carrito.agregarProducto(papasGrandes);
        carrito.agregarProducto(gaseosa);

        System.out.println(carrito.precioTotal());


    }
}
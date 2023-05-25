package composite;

import java.util.ArrayList;
import java.util.List;

public class Combinada implements Pizza{
    private String nombre, descripcion;

    private List<Pizza> pizzas;

    public Combinada(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pizzas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Combinada{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", pizzas=" + pizzas +
                ", costo=" + calcularPrecio() +
                '}';
    }

    public void agregaPizza(Pizza pizza){
        this.pizzas.add(pizza);
    }


    //recorro la lista de pizzas y me quedo con la que tiene el precio mas caro
    public Double calcularPrecio() {

        double precioMayor = 0.0;

        for(Pizza pizza:pizzas){
            if (pizza.calcularPrecio()> precioMayor)
            precioMayor = pizza.calcularPrecio() ;
        }
        return precioMayor;

    }

}

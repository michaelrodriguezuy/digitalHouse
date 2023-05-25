package clases;

import composite.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Pizza> pizzas;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.pizzas = new ArrayList<>();
    }

    public void agregaPizza(Pizza pizza){
        this.pizzas.add(pizza);
    }

    //mostrar pizzas
    public List<String> mostrarPizzas(){
        List<String> lista = new ArrayList<>();
        for(Pizza pizza:pizzas){
            lista.add(pizza.toString());
        }
        return lista;
    }
}

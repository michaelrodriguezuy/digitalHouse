package factory;

import composite.Combinada;
import composite.Pizza;
import composite.Simpe;

public class PizzaFactory {
    private static PizzaFactory instance;

    private PizzaFactory(){};

    public static PizzaFactory getInstance(){
        if (instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza crearPizza(String codigo, String nombre, String descripcion){
        switch (codigo){
            case "Simple":
                return new Simpe(nombre, descripcion);
            case "Combinada":
                return new Combinada(nombre, descripcion);
            default:
                System.out.println("Aun no tenemos esa pizza, pero ya la tendremos!!");
        }
        return null;
    }
}

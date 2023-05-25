import clases.Pizzeria;
import composite.Combinada;
import composite.Pizza;
import composite.Simpe;
import factory.PizzaFactory;

public class Test {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria("La Mas mejor");

        Pizza muzzarella = PizzaFactory.getInstance().crearPizza( "Simple","muzzarella","ta buenaza");

        Pizza margarita = PizzaFactory.getInstance().crearPizza("Simple","margarita","ta buenaza2");

        Pizza anana = PizzaFactory.getInstance().crearPizza("Simple","anana","ta buenaza4");
        Pizza loca = PizzaFactory.getInstance().crearPizza("Combinada","loca","ta buenaza3");


        ((Simpe)muzzarella).setPrecioBase(700.00);
        ((Simpe)margarita).setPrecioBase(850.00);
        ((Simpe)margarita).setEspecial(true);
        ((Simpe)anana).setPrecioBase(950.00);

        //combinada
        ((Combinada)loca).agregaPizza(margarita);
        ((Combinada)loca).agregaPizza(anana);
        ((Combinada)loca).calcularPrecio();

        pizzeria.agregaPizza(muzzarella);
        pizzeria.agregaPizza(margarita);
        pizzeria.agregaPizza(loca);
        pizzeria.agregaPizza(anana);

        for (String pizza:pizzeria.mostrarPizzas()){
            System.out.println(pizza);
        }

    }
}
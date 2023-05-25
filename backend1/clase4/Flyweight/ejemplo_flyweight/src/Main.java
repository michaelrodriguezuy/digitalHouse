import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        List<Computer> pedido = new ArrayList<>();
        String mensajeDeDespedida = "--END--";
        String mensajeX = "--END--";
        mensajeX = "BLA";
        mensajeDeDespedida = mensajeDeDespedida + "!!!!!";

        pedido.add(factory.buildNewComputer("MaC"));

        for(int i=0; i<10000; i++){
            pedido.add(factory.buildNewComputer("win"));
        }

        pedido.get(1).setBrand("Asus");
        pedido.get(2).setBrand("HP");

        System.out.println("--END--");
    }
}
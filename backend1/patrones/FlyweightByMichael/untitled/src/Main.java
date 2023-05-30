import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String nombresCanciones[] = {"la roja al pecho", "bohemian rapsody","keloke","el niagara en bicicleta","uka yaka"};

    public static void main(String[] args) {

        Cancion cancion1 = new Cancion("la roja al pecho");
        Cancion cancion2 = new Cancion("bohemian rapsody");
        Cancion cancion3 = new Cancion("keloke");
        Cancion cancion4 = new Cancion("el niagara en bicicleta");
        Cancion cancion5 = new Cancion("keloke");
        Cancion cancion6 = new Cancion("keloke2");
        Cancion cancion7 = new Cancion("keloke");

        List<Cancion> listaCanciones = new ArrayList();
        listaCanciones.add(cancion1);
        listaCanciones.add(cancion2);
        listaCanciones.add(cancion3);
        listaCanciones.add(cancion4);
        listaCanciones.add(cancion5);
        listaCanciones.add(cancion6);
        listaCanciones.add(cancion7);

        for (int i = 0; i < listaCanciones.size(); i++) {
            //ESTE MUESTRA CADA VEZ QUE SE AGREGA UNA NUEVA CANCION A LA LISTA
            Cancion cancion = CancionFactory.obtenerCancion(listaCanciones.get(i).getNombre());
            //cancion.setArtista("Manuel");
            //cancion.setGenero("Cumbia");
        }
        System.out.println(CancionFactory.listaCanciones() );

        System.out.println("********************************************");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }




}
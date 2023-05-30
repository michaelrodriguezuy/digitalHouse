import java.util.HashMap;

public class CancionFactory {

    private static final HashMap<String, Cancion> cancionMap = new HashMap<>();

    //private static List<Cancion> playlist = new ArrayList();

    public static Cancion obtenerCancion(String nombre) {
        Cancion cancion = cancionMap.get(nombre);

        if (cancion == null) {
            cancion = new Cancion(nombre);
            cancionMap.put(nombre, cancion);
            System.out.println("La cancion "+"'"+nombre+"' se agrego a la lista");
        }
        return cancion;
    }

    public static HashMap<String, Cancion> listaCanciones (){
        return cancionMap;
    }
/*
    public static Arrays armaListaCanciones(Cancion cancion) {

        for (int i = 0; i < playlist.size(); i++) {
            if (!playlist.get(i).getNombre().equals(cancion)){
                playlist.add(cancion);
            }
        }

        return (Arrays) playlist;
    }
*/
}

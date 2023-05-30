public class Cancion {
    private String nombre, artista, genero;

    public Cancion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /*
    public void mostrarCancion(){
        System.out.println("La cancion que agrego a la lista es "+nombre);
    }

     */

}

package cadenaResponsabilidad;

public abstract class AnalistaDeCalidad {

    private AnalistaDeCalidad sucessor;

    public AnalistaDeCalidad(AnalistaDeCalidad sucessor) {
        this.sucessor = sucessor;

    }


}

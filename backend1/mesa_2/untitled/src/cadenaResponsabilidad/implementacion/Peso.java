package cadenaResponsabilidad.implementacion;

import cadenaResponsabilidad.AnalistaDeCalidad;

public class Peso extends AnalistaDeCalidad {

    private int minimo= 1200;
    private int maximo = 1300;

    public Peso(AnalistaDeCalidad sucessor, int minimo, int maximo) {
        super(sucessor);

    }

    public int getMinimo() {
        return minimo;
    }

    public int getMaximo() {
        return maximo;
    }
}

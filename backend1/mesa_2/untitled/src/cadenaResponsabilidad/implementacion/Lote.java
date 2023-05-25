package cadenaResponsabilidad.implementacion;

import cadenaResponsabilidad.AnalistaDeCalidad;

public class Lote extends AnalistaDeCalidad {

    private int Minimo=1000;
    private int Maximo=2000;

    public Lote(AnalistaDeCalidad sucessor) {
        super(sucessor);
    }

    public int getMinimo() {
        return Minimo;
    }

    public int getMaximo() {
        return Maximo;
    }
}

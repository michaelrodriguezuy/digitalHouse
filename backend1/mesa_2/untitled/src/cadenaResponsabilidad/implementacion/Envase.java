package cadenaResponsabilidad.implementacion;

import cadenaResponsabilidad.AnalistaDeCalidad;

public class Envase extends AnalistaDeCalidad{

    private String sano="sano";
    private String casiSano="casi sano";

    public Envase(AnalistaDeCalidad sucessor) {
        super(sucessor);
    }

    public String getSano() {
        return sano;
    }

    public String getCasiSano() {
        return casiSano;
    }
}

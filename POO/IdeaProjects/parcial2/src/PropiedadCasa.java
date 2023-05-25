import java.time.LocalDate;

public class PropiedadCasa extends Propiedad implements Comparable{

    private Integer cantAmbientes;
    private Double cantMetrosCuadrados;

    public PropiedadCasa(LocalDate fechaAdquisicion, Double precio, String direccion, Boolean hipotecada, Duenio duenio, Integer cantAmbientes, Double cantMetrosCuadrados) {
        super(fechaAdquisicion, precio, direccion, hipotecada, duenio);
        this.cantAmbientes = cantAmbientes;
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    @Override
    public int compareTo(Object o) {
        PropiedadCasa propiedadCasaXparametro = (PropiedadCasa)o;

        if (this.cantAmbientes>propiedadCasaXparametro.cantAmbientes) {
            return 1;
        }
        else if(this.cantAmbientes<propiedadCasaXparametro.cantAmbientes) {
            return -1;
        }
        return 0;
    }
}

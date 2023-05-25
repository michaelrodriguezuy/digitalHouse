import java.time.LocalDate;

public class PropiedadCampo extends Propiedad{
    private Boolean casco;
    private Integer cantHectareas;

    public PropiedadCampo(LocalDate fechaAdquisicion, Double precio, String direccion, Boolean hipotecada, Duenio duenio, Boolean casco, Integer cantHectareas) {
        super(fechaAdquisicion, precio, direccion, hipotecada, duenio);
        this.casco = casco;
        this.cantHectareas = cantHectareas;
    }

    public Boolean esAptoCultivo() {
        return this.cantHectareas>10;
    }
}

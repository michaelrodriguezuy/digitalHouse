import java.time.LocalDate;

public abstract class Propiedad {
    private LocalDate fechaAdquisicion;
    private Double precio;
    private String direccion;
    private Boolean hipotecada;
    private Duenio duenio;

    public Propiedad(LocalDate fechaAdquisicion, Double precio, String direccion, Boolean hipotecada, Duenio duenio) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.precio = precio;
        this.direccion = direccion;
        this.hipotecada = hipotecada;
        this.duenio = duenio;
    }

    public Boolean sePuedeVender(){
        return this.hipotecada;
    }
}

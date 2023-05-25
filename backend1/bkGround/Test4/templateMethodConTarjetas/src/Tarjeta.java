import java.time.LocalDate;

public abstract class Tarjeta {

    private String numero;
    private int codigoSeguridad;
    private LocalDate fechaExpira;

    public String getNumero() {
        return numero;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public LocalDate getFechaExpira() {
        return fechaExpira;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public void setFechaExpira(LocalDate fechaExpira) {
        this.fechaExpira = fechaExpira;
    }

    public Tarjeta(String numero, int codigoSeguridad, LocalDate fechaExpira) {
        this.numero = numero;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaExpira = fechaExpira;
    }


}

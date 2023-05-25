import java.time.LocalDate;

public class TarjetaDebito extends Tarjeta {

    private int saldoDisponible;

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public TarjetaDebito(String numero, int codigoSeguridad, LocalDate fechaExpira, int saldoDisponible) {
        super(numero, codigoSeguridad, fechaExpira);
        this.saldoDisponible = saldoDisponible;
    }

    protected boolean autorizacion(double montoCompra){
        if (this.getSaldoDisponible()>=montoCompra) {
            return true;
        }
        else {
            return false;
        }
    }


}

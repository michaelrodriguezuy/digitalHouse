import java.time.LocalDate;

public class TarjetaCredito extends Tarjeta{

    private int limite;
    private double saldoUtilizado;

    public int getLimite() {
        return limite;
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public TarjetaCredito(String numero, int codigoSeguridad, LocalDate fechaExpira, int limite, double saldoUtilizado) {
        super(numero, codigoSeguridad, fechaExpira);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }


    protected boolean autorizacion(double montoCompra){
        if (this.getLimite()>=montoCompra+this.getSaldoUtilizado()) {
            return true;
        }
        else {
            return false;
        }
    }


}

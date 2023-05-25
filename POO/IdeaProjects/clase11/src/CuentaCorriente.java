public class CuentaCorriente extends Cuenta{
    private Double montoAutorizado;

    public CuentaCorriente(Cliente cliente, Double saldo, Double montoAutorizado) {
        super(cliente, saldo);
        this.montoAutorizado = montoAutorizado;
    }

    public Double getMontoAutorizado() {
        return montoAutorizado;
    }

    @Override
    public void depositar(Double monto) {
        super.setSaldo(monto);
    }

    @Override
    public void extraer(Double monto) {
        if (super.getSaldo()>monto) {
            super.setSaldo(-monto);
        } else if (super.getSaldo()<=monto && this.montoAutorizado>0) {
            this.montoAutorizado-=monto;
        }
    }
}

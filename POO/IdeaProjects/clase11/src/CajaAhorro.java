public class CajaAhorro extends Cuenta{
    private Double tasaInteres;

    public CajaAhorro(Cliente cliente, Double saldo, Double tasaInteres) {
        super(cliente, saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(Double monto) {
        super.setSaldo(monto);
    }

    @Override
    public void extraer(Double monto) {
        if (super.getSaldo()>monto) {
            super.setSaldo(-monto);
        }
    }

    public Double cobrarInteres() {
        return super.getSaldo()* this.tasaInteres;
    }
}

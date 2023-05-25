public abstract class Cuenta {

    private Double saldo;
    private Cliente cliente;

    public Cuenta(Cliente cliente, Double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double monto){
        this.saldo+=monto;
    }

    public abstract void depositar(Double monto);
    public abstract void extraer(Double monto);

}

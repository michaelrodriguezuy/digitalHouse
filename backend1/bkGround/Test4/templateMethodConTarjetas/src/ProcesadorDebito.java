public class ProcesadorDebito extends Procesador{

    @Override
    protected void realizarPago(Tarjeta tarjetaCompra, double monto) {

        if (tarjetaCompra instanceof TarjetaDebito) {
            TarjetaDebito td = (TarjetaDebito) tarjetaCompra;

            if (td.autorizacion(monto)) {
                System.out.println("Felicitaciones por su compra con su TD :)");
            } else {
                System.out.println("Su saldo disponible no es suficiente :(");
            }
        }
        ;

    }

}

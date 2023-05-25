public class ProcesadorCredito extends Procesador{


    @Override
    protected void realizarPago(Tarjeta tarjetaCompra, double monto) { //aca tengo una tarjeta generica

        if (tarjetaCompra instanceof TarjetaCredito) { //valido que la tarjeta que me enviaron sea una Tarjeta Credito
            TarjetaCredito tc = (TarjetaCredito) tarjetaCompra; // aca tengo una tarjeta credito


            if (tc.autorizacion(monto)) {
                System.out.println("Felicitaciones por su compra con su TC :)");
            }
            else {
                System.out.println("Su limite disponible no es suficiente :(");
            }
        };
    }

}

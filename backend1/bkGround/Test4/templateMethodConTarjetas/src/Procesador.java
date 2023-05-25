import java.time.LocalDate;

public  abstract class Procesador {

    //template method
    // para luego poder hacer un test sobre el Template Method tengo que hacer que este retorne algo
    public final boolean procesarPago(Tarjeta tarjetaCompra, double montoCompra) {
        boolean noVencida = LocalDate.now().isBefore(tarjetaCompra.getFechaExpira());

        if (noVencida && montoCompra>0) {
            realizarPago(tarjetaCompra,montoCompra);
            return true;
        }
        else {
            System.out.println("Su tarjeta esta vencida o la tienda decidió regalarle su compra!");
            return false;
        }
    }

    //metodo abstracto
    //protected abstract boolean autorizacion(double monto);

    //metodo abstracto forma 2
    //de esta forma puedo personalizar las respuestas
    protected abstract void realizarPago(Tarjeta tarjetaCompra, double monto);

    //metodo concreto forma 1
    /*
    private void realizarPago(double montoCompra){
        if (autorizacion(montoCompra)) {
            System.out.println("Felicitaciones por su compra :)");
        }
        else {
            System.out.println("Su compra no se pudo realizar :(");
        }
    };
*/


}

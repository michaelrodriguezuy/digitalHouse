public class CajaService {
    public boolean entregarDinero (Cuenta cuenta, Double monto) {
            if (cuenta.getSaldoActual()>=monto) {
                cuenta.setSaldoActual(cuenta.getSaldoActual()-monto);
                return true;
            }
        return false;
    }
}

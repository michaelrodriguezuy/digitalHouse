package manejador;

import model.EmpleadoBanco;

public class EjecutivoDeCuenta extends EmpleadoBanco {


    @Override
    public void procesarSolicitud(Integer monto) {
        if (monto <60000) {
            System.out.println("Yo me encargo, soy el Ejecutivo de cuentas!!");
        }
        else if (getSigEmpleadoBanco() != null) {
            getSigEmpleadoBanco().procesarSolicitud(monto);
        }
    }
}

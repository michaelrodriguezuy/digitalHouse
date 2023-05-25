package model;

public class Director extends EmpleadoBanco{

    @Override
    public void procesarSolicitud(Integer monto) {
        if (monto >200000) {
            System.out.println("Yo me encargo, soy el dire!!");
        }
        else if (getSigEmpleadoBanco() != null) {
            getSigEmpleadoBanco().procesarSolicitud(monto);
        }
    }
}

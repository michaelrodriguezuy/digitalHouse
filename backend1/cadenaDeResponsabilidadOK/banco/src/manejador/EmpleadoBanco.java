package model;

public abstract class EmpleadoBanco {

    private EmpleadoBanco sigEmpleadoBanco;


    //metodo abstracto
    public abstract void procesarSolicitud (Integer monto);



    //getters y setters
    public void setSigEmpleadoBanco(EmpleadoBanco emp) {
        sigEmpleadoBanco = emp;
    }

    public EmpleadoBanco getSigEmpleadoBanco() {
        return sigEmpleadoBanco;
    }

}

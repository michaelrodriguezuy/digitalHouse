public abstract class Liquidador {

    public final int pagarNomina(Empleado e){ //Template method
        int sueldo = calcularElSueldo(e);
        notificar(e, sueldo);
        consignar(sueldo, e.getNumeroDeCuenta());

        return sueldo;
    }

    protected abstract int calcularElSueldo (Empleado e);

    protected abstract void notificar (Empleado e, int sueldo);

    private void consignar (int sueldo, String cuenta){
        System.out.println("Fueron consignados " + sueldo + " pesos a la cuenta " + cuenta + ".");
    }
}

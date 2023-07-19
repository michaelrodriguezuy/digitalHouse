public class RetiraService implements IRetiraService{

    private AutenticacionService autenticacion;
    private CuentaService cuentaService;
    private CajaService caja;


    public RetiraService(AutenticacionService as, CuentaService cs, CajaService cs2) {
        this.autenticacion =  as;
        this.cuentaService = cs;
        this.caja = caja = cs2;
    }

    @Override
    public void procesarRetiro(int Identificador, String password,Cuenta cuenta, Double monto) {
        if (autenticacion.chequeaUsuario(cuentaService.getCuenta(Identificador), Identificador,password)) {
            if (caja.entregarDinero(cuentaService.getCuenta(Identificador),monto)) {
                System.out.println("Su saldo actual es de $"+cuentaService.getCuenta(Identificador).getSaldoActual());
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Los datos ingresados no son válidos");
        }
    }
}

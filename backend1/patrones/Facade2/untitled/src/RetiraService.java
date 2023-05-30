public class RetiraService implements IRetiraService{

    private AutenticacionService autenticacion;
    private CuentaService cuentaService;
    private CajaService caja;


    public RetiraService() {
        this.autenticacion = new AutenticacionService();
        this.cuentaService = new CuentaService();
        this.caja = caja = new CajaService();
    }

    @Override
    public boolean procesarRetiro(int Identificador, String password,Cuenta cuenta, Double monto) {

    }
}

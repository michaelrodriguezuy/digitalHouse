public class CuentaService {


    public Cuenta getCuenta (int Identificador){
        for (Cuenta c : AutenticacionService.cuentas){
            if (c.getIdUsuario()==Identificador) {
                return c;
            }
        }
        return null;
    }
}

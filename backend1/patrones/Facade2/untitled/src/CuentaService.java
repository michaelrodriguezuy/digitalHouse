import java.util.ArrayList;
import java.util.List;

public class CuentaService {

    private List<Cuenta> cuentas;

    public Cuenta getCuenta (int Identificador){
        for (Cuenta c : cuentas){
            if (c.getIdUsuario()==Identificador) {
                return c;
            }
        }
        return null;
    }

    public CuentaService(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}

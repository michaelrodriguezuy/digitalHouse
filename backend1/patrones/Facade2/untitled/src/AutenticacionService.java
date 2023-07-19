import java.util.List;

public class AutenticacionService {

    //lo hice asi nomas para probar el facede solamente, no es la mejor implementacion
    public boolean chequeaUsuario(Cuenta cuentaTest,int ID, String password){
        if ((cuentaTest.getIdUsuario()==ID) && (cuentaTest.getPassword().equals(password))) {
                return true; //me devuelve true si valida en algunas de las cuentas de la lista,
        }
        return false;
    }
}

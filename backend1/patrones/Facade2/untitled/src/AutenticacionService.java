import java.util.List;

public class AutenticacionService {
    public static List<Cuenta> cuentas;

    //lo hice asi nomas para probar el facede solamente, no es la mejor implementacion
    public boolean chequeaUsuario(int ID, String password){
        for (Cuenta c : this.cuentas){
            if ((c.getIdUsuario()==ID) && (c.getPassword().equals(password))) {
                return true; //me devuelve true si valida en algunas de las cuentas de la lista,
            }
        }
        return false;
    }
}

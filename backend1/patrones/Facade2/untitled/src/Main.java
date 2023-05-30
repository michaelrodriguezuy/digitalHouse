import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cuenta> cuentas = new ArrayList<>();

        Cuenta cuenta1=  new Cuenta(1234, "abcd",12000);
        Cuenta cuenta2=  new Cuenta(1235, "bacd",2000);
        Cuenta cuenta3=  new Cuenta(1236, "1234",23000);

        IRetiraService retiro = new RetiraService();

        retiro.procesarRetiro(1234, "abcd", cuenta1, 11900.00);

        retiro.procesarRetiro(1234, "abcd", cuenta1, 2000.00);


    }
}
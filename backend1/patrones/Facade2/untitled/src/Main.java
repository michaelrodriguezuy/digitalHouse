import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1=  new Cuenta(1234, "abcd",12000);
        Cuenta cuenta2=  new Cuenta(1235, "bacd",2000);
        Cuenta cuenta3=  new Cuenta(1236, "1234",23000);

        IRetiraService retiro = new RetiraService(new AutenticacionService(), new CuentaService(Arrays.asList(cuenta1,cuenta2,cuenta3)), new CajaService());

        retiro.procesarRetiro(1234, "abcd", cuenta1, 11900.00);
        retiro.procesarRetiro(1234, "abcd", cuenta1, 2000.00);

    }
}
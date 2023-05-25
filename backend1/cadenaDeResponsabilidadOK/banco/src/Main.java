import manejador.EjecutivoDeCuenta;
import model.Director;
import model.EmpleadoBanco;
import model.Gerente;

public class Main {
    public static void main(String[] args) {

        EmpleadoBanco empl1 = new EjecutivoDeCuenta();
        EmpleadoBanco empl2 = new Gerente();
        EmpleadoBanco empl3 = new Director();

        empl2.setSigEmpleadoBanco(empl3);
        empl1.setSigEmpleadoBanco(empl2);
        empl3.setSigEmpleadoBanco(empl1);

       // empl1.procesarSolicitud(78000);
        //empl2.procesarSolicitud(59000);

        empl3.procesarSolicitud(1178000);
    }
}
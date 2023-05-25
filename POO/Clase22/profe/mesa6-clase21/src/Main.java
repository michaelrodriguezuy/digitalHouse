import clases.Reparacion;

public class Main {
    public static void main(String[] args) {



        Reparacion rep = new Reparacion("Batidora");



        try{
            rep.valorPresupuesto(900.0);

            rep.siguientePaso();

            rep.agregarRepuestos(90.0);
            rep.agregarRepuestos(120.0);

            rep.siguientePaso();

            rep.cambiarDireccion("Siempreviva 123");

            rep.siguientePaso();

            System.out.println(rep.toString());
        }catch (Exception e){
            System.out.println(e);
        }



    }
}
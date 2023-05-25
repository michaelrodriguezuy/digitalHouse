import clases.Reparacion;

public class Main {
    public static void main(String[] args) {

        Reparacion unaReparacion = new Reparacion("batidora");

        try {
            System.out.println("Reparacion por default -> "+unaReparacion.toString());
            unaReparacion.setPresupuesto(1250.0);
            System.out.println("Agrego un presupuesto -> "+unaReparacion.toString());
            unaReparacion.siguientePaso();
            System.out.println("Cambia de estado -> "+unaReparacion.toString());

            unaReparacion.agregarRepuestos(500.0);
            System.out.println("Le sumo repuestos -> "+unaReparacion.toString());

            unaReparacion.siguientePaso();
            System.out.println("Cambia de estado -> "+unaReparacion.toString());

            unaReparacion.cambiarDireccion("Lejazo 1234");
            System.out.println("Cambia la direccion -> "+unaReparacion.toString());

            unaReparacion.siguientePaso();
            System.out.println("Cambia de estado -> "+unaReparacion.toString());
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
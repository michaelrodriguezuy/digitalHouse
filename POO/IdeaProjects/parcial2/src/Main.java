import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Duenio duenio1 = new Duenio("Eduardo", "Garcia", "12132132132131");
        Duenio duenio2 = new Duenio("Pedro", "Almodovar", "445757575");

        Propiedad casa1 = new PropiedadCasa(LocalDate.now(), 25000.0, "Lejazo 1234", false, duenio1, 8,65.0);
        Propiedad casa2 = new PropiedadCasa(LocalDate.now(), 25000.0, "Lejazo 5678", true, duenio2, 10,105.0);

        Propiedad campo1 = new PropiedadCampo(LocalDate.now(), 125000.0, "Lejazo 8975", false, duenio1, true,8);
        Propiedad campo2 = new PropiedadCampo(LocalDate.now(), 75000.0, "Lejazo 5656", true, duenio2, false,10500);

        System.out.println("Se puede vender "+ casa1.sePuedeVender());
        System.out.println("Se puede vender "+ casa2.sePuedeVender());

        System.out.println( ((PropiedadCasa)casa1).compareTo((PropiedadCasa)casa2));

        System.out.println(((PropiedadCampo)campo1).esAptoCultivo());
        System.out.println(((PropiedadCampo)campo2).esAptoCultivo());
    }
}
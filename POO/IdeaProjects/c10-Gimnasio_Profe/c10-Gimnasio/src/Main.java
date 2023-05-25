public class Main {
    public static void main(String[] args) {
        Socio socioComun = new Socio(1, "Juan", 1800.0, "Musculacion");
        SocioPileta socioPileta = new SocioPileta(2, "Pepe", 1800.0,"Pileta",500.0,true);

        System.out.println(" --- Socio Comun ----");
        System.out.println(socioComun.toString());
        System.out.println(socioComun.calcularCostoMensual());
        System.out.println(" --- Socio Pileta ----");
        System.out.println(socioPileta.toString());
        System.out.println(socioPileta.calcularCostoMensual());

    }
}
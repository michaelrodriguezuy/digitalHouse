public class Main {
    public static void main(String[] args) {

        Capitan capi = new Capitan("Juan", "Cuestas", "AAA3333");
        Capitan masCapiTo = new Capitan("Pedro", "Picapiedras", "AAA4444");
        Capitan capitan3 = new Capitan("Enrique", "Pinti", "AAA55555");
        Capitan capitan4 = new Capitan("Mario", "Uberti", "AAA55665656");



        Embarcacion yatito = new EmbarcacionYate(2500.0, 170.00, 8.5,1980, 7, capi);
        Embarcacion elRapidoDelOeste = new EmbarcacionYate(2400.0, 190.00, 9.5,2022, 9, masCapiTo);

        Embarcacion velita = new EmbarcacionVelero(3000.0, 220.0, 14.0, 2022, 2, capitan3);
        Embarcacion gasolero = new EmbarcacionVelero(3200.0, 200.0, 12.0, 1990, 8, capitan4);

        System.out.println("Nuestros capitanes");
        System.out.println("Los capitanes de Navetur son: "+ capi.getNombre()+ " "+capi.getApellido()+", "+ masCapiTo.getNombre()+ " "+masCapiTo.getApellido()+", "
                + capitan3.getNombre()+ " "+capitan3.getApellido()+", "+ capitan4.getNombre()+ " "+capitan4.getApellido()+", ");

        System.out.println("++++++++++++++++++++++++");

        System.out.println("Costos Alquileres");
        System.out.println("El costo de alquiler de nuestro barco 1 son: "+((EmbarcacionVelero)velita).calcularAlquiler());
        System.out.println("El costo de alquiler de nuestro barco 2 son: "+((EmbarcacionVelero)gasolero).calcularAlquiler());
        System.out.println("El costo de alquiler de nuestro barco 3 son: "+((EmbarcacionYate)yatito).calcularAlquiler());
        System.out.println("El costo de alquiler de nuestro barco 4 son: "+((EmbarcacionYate)elRapidoDelOeste).calcularAlquiler());

        System.out.println("++++++++++++++++++++++++");

        System.out.println("Tamaño veleros");
        System.out.println("El velero 1 es grande? "+((EmbarcacionVelero)gasolero).esGrande());
        System.out.println("El velero 2 es grande? "+((EmbarcacionVelero)velita).esGrande());

        System.out.println("++++++++++++++++++++++++");

        System.out.println("yates lujosos");
        if (((EmbarcacionYate)yatito).compareTo((EmbarcacionYate)elRapidoDelOeste) == 1 ){
            System.out.println("Nuestro yate mas lujoso es "+yatito.toString());
        }
        else if ((((EmbarcacionYate)yatito).compareTo((EmbarcacionYate)elRapidoDelOeste) == -1 )) {
            System.out.println("Nuestro yate mas lujoso es "+elRapidoDelOeste.toString());
        }
        else {
            System.out.println("Todos nuestros yates cuentan con el mismo nivel de lujo");
        }

    }
}
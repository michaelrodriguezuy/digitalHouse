public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1234, null, "12345A", "4654654654RE");
        CajaAhorro ca1 = new CajaAhorro(cliente1, 100.0, 0.3);

        System.out.println(ca1.getSaldo());
        ca1.depositar(50.0);
        ca1.extraer(100.0);
        System.out.println(ca1.getSaldo());

        System.out.println("*+********************************");

        Cliente cliente2 = new Cliente(5678, "Garcia", "4564654#", "455465455");
        CuentaCorriente cc1 = new CuentaCorriente(cliente2, 200.0, 250.0);

        System.out.println("El cliente 2 es "+ cliente2.getApellido());
        System.out.println("El saldo del cliente " +cliente2.getApellido()+ " es de $"+cc1.getSaldo());
        cc1.depositar(50.0);
        cc1.extraer(100.0);
        System.out.println("El nuevo saldo luego de depositar y extraer es de $"+cc1.getSaldo());
        System.out.println("El monto autorizado para " +cliente2.getApellido()+" es $"+cc1.getMontoAutorizado()); //antes de volver a extraer
        cc1.extraer(200.0); //el saldo no es suficiente, por lo tanto lo deberia de restar del montoAutorizado
        //System.out.println("El saldo es: "+cc1.getSaldo());
        System.out.println("El monto autorizado ha sido actualizado, luego de la ultima extraccion quedo en $"+cc1.getMontoAutorizado());
        System.out.println(cliente2.getApellido()+" estas en el horno!!");
    }
}